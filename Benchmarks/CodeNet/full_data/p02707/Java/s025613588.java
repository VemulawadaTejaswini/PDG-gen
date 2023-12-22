import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int N = Integer.parseInt(str);

		int A[] = new int[N - 1];
		int count[] = new int[N];

		for (int i = 0; i < N - 1; i++) {
			String a = reader.readLine();
			A[i] = Integer.parseInt(a);

		}

		for (int i = 1; i < N + 1; i++) {
			count[i - 1] = 0;
			for (int j = 0; j < N - 1; j++) {
				if (A[j] == i) {
					count[i - 1]++;
				}
			}
			System.out.println(count[i - 1]);
		}
	}
}

