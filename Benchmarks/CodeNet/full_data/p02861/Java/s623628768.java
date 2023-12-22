import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static int[] x, y;
	static int permN;
	static double sum;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] array = new int[N];
		x = new int[N];
		y = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = i + 1;
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}
		sum = 0.0;
		permN = 0;
		permutation(array);
		System.out.println((double)sum / (double)permN);
	}

	private static void permutation(int[] seed) {
		int[] perm = new int[seed.length];
		boolean[] used = new boolean[seed.length];
		buildPerm(seed, perm, used, 0);
	}

	private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
		if (index == seed.length) {
			procPerm(perm);
			return;
		}

		for (int i = 0; i < seed.length; i++) {
			if (used[i]) {
				continue;
			}
			perm[index] = seed[i];
			used[i] = true;
			buildPerm(seed, perm, used,index + 1);
			used[i] = false;
		}
	}

	private static void procPerm(int[] perm) {
		permN++;
		double s = 0.0;
		for (int i = 0; i < perm.length - 1; i++) {
			s += Math.sqrt(Math.pow((double)(x[perm[i] - 1] - x[perm[i + 1] - 1]), 2.0) + Math.pow((double)(y[perm[i] - 1] - y[perm[i + 1] - 1]), 2.0));
		}
		sum += s;
	}
}