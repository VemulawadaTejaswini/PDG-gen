import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + 1;
		int k = sc.nextInt();
		long res = 0l;
		long[] array = new long[n + 2];
		array[0] = 1;
		array[1] = n;
		for (int i = 2; i <= n + 1; i++) {
			long tmp = array[i - 1];
			array[i] = tmp;
			array[i] *= n - i + 1l;
			array[i] /= i - 1l;
			array[i] += tmp;
			array[i] %= (long) (1e9 + 7);
			if (array[i] < 0l) {
				array[i] += 1000000007;
			}
		}
		res = array[n] - array[k + 1];
		res %= (long) (1e9 + 7);
		if (res == 0l) {
			res = 1l;
		}
		System.out.println(res);
	}
}
