import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		long N = Long.parseLong(in.readLine());

		int sqrt = (int) Math.floor(Math.sqrt((double) N));
		long result = (long) sqrt * (long) sqrt;
		System.out.println(result);

	}
}
