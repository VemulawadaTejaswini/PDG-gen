import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int X = Integer.parseInt(tokens[0]);
		int Y = Integer.parseInt(tokens[1]);
		int result = getValue(X) + getValue(Y);
		if (X == 1 && Y == 1) {
			result += 400000;
		}
		System.out.println(result);
	}

	static int getValue(int rank) {
		switch (rank) {
		case 1:
			return 300000;
		case 2:
			return 200000;
		case 3:
			return 100000;
		default:
			return 0;
		}
	}

}
