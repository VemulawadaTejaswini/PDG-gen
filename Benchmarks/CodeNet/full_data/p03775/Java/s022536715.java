/**
 * ACB057-C-Digits in Multiplication
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		long N = parseLong(br.readLine());

		int d = (int) Math.sqrt(N);

		while (N % d != 0) d++;

		System.out.println(String.valueOf(d).length());

	}
}