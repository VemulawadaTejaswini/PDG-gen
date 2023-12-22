import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int N = Integer.parseInt(str);

		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = 0;
		}

		for (int i = 0; i < N - 1; i++) {
			String a = reader.readLine();
			int count = Integer.parseInt(a);
			A[count - 1]++;
		}

		// for (int j = 0; j < N - 1; j++) {
		// String k = reader.readLine();
		// int count = Integer.parseInt(k);
		// A[count - 1]++;
		// }

		for (int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}
	}
}
