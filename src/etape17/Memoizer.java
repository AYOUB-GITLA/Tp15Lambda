package etape17;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer {

    public static void main(String[] args) {
        MemoizedFunction<Integer, Long> fib = (self, n) -> {
            if (n <= 1) return (long) n;
            System.out.println("Calcul de fibonacci(" + n + ")");
            return self.apply(n - 1) + self.apply(n - 2);
        };

        Function<Integer, Long> fibMemo = memoize(fib);

        System.out.println("fib(10) = " + fibMemo.apply(10));
        System.out.println("fib(10) = " + fibMemo.apply(10)); // Devrait être instantané
    }

    @FunctionalInterface
    interface MemoizedFunction<T, R> {
        R apply(Function<T, R> self, T input);
    }

    public static <T, R> Function<T, R> memoize(MemoizedFunction<T, R> function) {
        Map<T, R> cache = new ConcurrentHashMap<>();
        Function<T, R> proxy = new Function<T, R>() {
            @Override
            public R apply(T input) {
                return cache.computeIfAbsent(input, n -> function.apply(this, n));
            }
        };
        return proxy;
    }
}
