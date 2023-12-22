import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		int x = Integer.parseInt(tokens[2]);
		double deg = 0.0;
		if (a * b * b / 2 <= x) {
			double z = ((double) x) * 2.0 / (double) a / (double) b;
			// double rad = Math.atan(2.0 * (double) (a * a * b - x) / (double) (a * a *
			// a));
			deg = 90 - Math.toDegrees(Math.atan(z / (double) b));
		} else {

			double rad = Math.atan((double) (a * b * b) / (double) (2.0 * x));
			deg = Math.toDegrees(rad);
		}
		System.out.println(String.format("%.15f", deg));
	}
}
