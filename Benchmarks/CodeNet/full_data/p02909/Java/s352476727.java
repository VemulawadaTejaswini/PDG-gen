
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String S = in.readLine();
		if (S.equals("Sunny")) {
			System.out.println("Cloudy");
		} else if (S.equals("Cloudy")) {
			System.out.println("Rainy");
		} else {
			System.out.println("Sunny");
		}
	}
}
