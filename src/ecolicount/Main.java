package ecolicount;

import static sbcc.Core.*;

import java.io.*;
import java.util.*;

import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;

public class Main {

	public static void main(String[] args) {
		try {
			// var fileName = readLine();
			var file = readFile("ecoli.txt");

			// var start = nanoTime();
			//
			// for (var nucleotide : List.of("A", "C", "G", "T"))
			// println("#" + nucleotide + " = " + countMatches(file, nucleotide));
			//
			// println("count Matches: " + ((nanoTime() - start) / 1e6) + " ms");

			var start = nanoTime();

			int[] array = new int[85];

			for (var c : file.getBytes())
				array[c]++;

			for (var c : List.of('A', 'C', 'G', 'T'))
				println("#" + c + " = " + array[c.charValue()]);

			println("charValue: " + ((nanoTime() - start) / 1e6) + " ms");

		} catch (Exception e) {
			println("File error");
		}
	}

}
