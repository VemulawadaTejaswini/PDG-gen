import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String[] line = b.readLine().split(" ");

		int N = Integer.parseInt(line[0]);
		int L = Integer.parseInt(line[1]);

		String[] S = new String[N];

		for (int i = 0; i < N; i++) {
			S[i] = b.readLine();
		}
		Arrays.sort(S);
		for (int i = 0; i < N; i++) {
			System.out.print(S[i]);
		}
		
	}

}