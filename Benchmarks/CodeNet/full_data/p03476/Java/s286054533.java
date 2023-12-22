import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Main {

	boolean[] isPrime = new boolean[200000];
	{
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i < isPrime.length; ++i) {
			if (!isPrime[i])
				continue;
			for (int j = 2 * i; j < isPrime.length; j += i) {
				isPrime[j] = false;
			}
		}
	}

	boolean[] a = new boolean[200000];

	public void run() {
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[200000];
		for (int i = 2; i < a.length; ++i) {
			if (isPrime[i] && isPrime[(i + 1) / 2]) {
				a[i] = true;
				sum[i]++;
			}
		}
		for (int i = 2; i < sum.length; ++i)
			sum[i] += sum[i - 1];
		int Q = sc.nextInt();
		for (int i = 0; i < Q; ++i) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(sum[r] - sum[l - 1]);
		}

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}
}
