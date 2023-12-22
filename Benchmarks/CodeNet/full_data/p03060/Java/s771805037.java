import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		int[] C = new int[N];
		int[] V = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			V[i] = Integer.parseInt(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			C[i] = Integer.parseInt(tokens[i]);
		}
		in.close();

		int result = 0;
		for (int i = 0; i < N; ++i) {
			if (V[i] - C[i] > 0) {
				result += V[i] - C[i];
			}
		}
		System.out.println(result);
	}

}