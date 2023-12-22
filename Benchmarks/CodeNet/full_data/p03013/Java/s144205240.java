import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int[] A = new int[M];
		boolean renzoku = false;
		for (int i = 0; i < M; i++) {
			line = reader.readLine();
			A[i] = Integer.parseInt(line);
		}
		for (int i = 0; i < M-1; i++) {
			if (A[i] + 1 == A[i+1]) {
				renzoku = true;
			}
		}
		if (renzoku) {
			System.out.println(0);
		}
		else {
			long ans = 1;
			int[] fib = new int[N];
			fib[1] = 1;
			fib[2] = 1;
			for (int i = 0; i < M; i++) {
				int sub = 0;
				if (i == 0) {
					sub = A[0];
				}
				else {
					sub = A[i] - A[i-1] - 1;
				}
				if (sub > 2) {
					for (int k = 3; k <= sub; k++) {
						fib[k] = fib[k-2] + fib[k-1];
					}
				}
				ans *= fib[sub];
			}
			int sub_final = N - A[M-1];
			if (sub_final > 2) {
				for (int k = 3; k <= sub_final; k++) {
					fib[k] = fib[k-2] + fib[k-1];
				}
			}
			ans *= fib[sub_final];
			ans = ans % 1000000007;
			System.out.println(ans);
		}
	}
}