import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		Arrays.sort(a);
		long max = 0;
		int in1 = 0;
		int in2 = 0;
		int digit = n;
		long s = 1;
		for (int i = n; i >= (n - 2) + 1; i--) {
			s *= i;
		}
		for (int i = 0; i < (1<<digit); i++) {
			int c = 0;
			int count = 0;
			int[] comb = new int[n];
			for (int j = digit-1, k = 0; j >= 0; j--, k++) {
				if (((i>>j) & 1) == 1) {
					comb[c] = a[k];
					c++;
				}
			}
			if (c != 2)
				continue;
			long ans = func(comb[1], comb[0]);
			if (ans > max) {
				in1 = comb[0];
				in2 = comb[1];
				max = ans;
			}
			count++;
			if (count == s)
				break;
		}
		System.out.println(in2 + " " + in1);
	}
	static long func(long n, long r) {
		long ans = 1;
		for (int i = 1; i <= r; i++) {
			ans = ans * (n - i + 1) / i;
		}
		return ans;
	}
}