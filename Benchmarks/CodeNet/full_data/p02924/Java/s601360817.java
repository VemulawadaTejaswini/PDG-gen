import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		long N = Long.parseLong(in.readLine());

		long result = 0;
		if (N == 1) {
			result = 0;
		} else if (N == 2) {
			result = 1;
		} else {
			result = (1 + N - 1) * (N - 1) / 2;
		}
		System.out.println(result);

	}

}
