import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int x = Integer.parseInt(in[1]);
		int[] arr = new int[n];
		in = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(in[i]);
		}
		long a = new Solver().solve(arr, x);
		System.out.println(a);
	}
}

class Solver {

	long solve(int[] a, int x) {
		long res = 0;
		if (a[0] + a[1] - x > a[1]) {
			res += (a[0] + a[1] - x - a[1]);
			a[0] -= (a[0] + a[1] - x - a[1]);
		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] + a[i - 1] > x) {
				res += (a[i] + a[i - 1] - x);
				a[i] -= (a[i] + a[i - 1] - x);
			}
		}
		return res;
	}
}
