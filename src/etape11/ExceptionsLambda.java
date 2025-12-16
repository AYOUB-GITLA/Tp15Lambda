package etape11;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class ExceptionsLambda {

	public static void main(String[] args) {
		try {
			List<String> fichiers = Files.list(Paths.get(".")).map(p -> {
				try {
					return Files.size(p) + " - " + p.getFileName();
				} catch (IOException e) {
					return "Erreur: " + p.getFileName();
				}
			}).collect(Collectors.toList());
			System.out.println("Fichiers: " + fichiers);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			List<Long> tailles = Files.list(Paths.get(".")).map(IOFunction.unchecked(Files::size))
					.collect(Collectors.toList());
			System.out.println("Tailles: " + tailles);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
