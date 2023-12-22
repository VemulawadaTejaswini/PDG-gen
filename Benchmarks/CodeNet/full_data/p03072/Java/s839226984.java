import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		int[] H = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			H[i] = Integer.parseInt(tokens[i]);
		}
		in.close();

		int count = 1;
		int max = H[0];
		for (int i = 1; i < N; ++i) {
			if (max <= H[i]) {
				++count;
			}
			max = Math.max(max, H[i]);
		}
		System.out.println(count);
	}

}
