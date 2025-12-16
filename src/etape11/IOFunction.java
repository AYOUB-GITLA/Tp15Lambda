package etape11;

import java.io.*;
import java.util.function.*;

@FunctionalInterface
interface IOFunction<T, R> {
    R apply(T t) throws IOException;
    
    static <T, R> Function<T, R> unchecked(IOFunction<T, R> f) {
        return t -> {
            try {
                return f.apply(t);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}