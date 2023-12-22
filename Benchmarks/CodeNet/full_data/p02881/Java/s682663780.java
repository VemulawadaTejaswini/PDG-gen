import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long save = n;
		ArrayList<Long> list = new ArrayList<Long>();

		for (int i = 2; i <= Math.sqrt(n);) {
			if (n % i == 0) { // 最小の因数を求める
				n /= i; // 最小の因数で割った数を代入する
				list.add((long) i);
			} else {
				i++;
			}
		}
		long[] prod = new long[2];
		prod[0] = 1;
		prod[1] = save;
		long ans = save - 1;
		for (int i = 0; i < list.size(); i++) {
			prod[0] *= list.get(i);
			prod[1] /= list.get(i);
			long tmp = prod[0] + prod[1] - 2;
			if (tmp < ans) {
				ans = tmp;
			} else {
				break;
			}
		}
		System.out.println(ans);
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}
