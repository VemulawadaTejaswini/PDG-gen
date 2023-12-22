import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int X = Integer.parseInt(tokens[1]);
		int[] L = new int[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			L[i] = Integer.parseInt(tokens[i]);
		}
		in.close();

		int count = 1;
		int val = 0;
		for (int i = 0; i < N; ++i) {
			val += L[i];
			if (val <= X) {
				++count;
			} else {
				break;
			}
		}
		System.out.println(count);
	}

}
