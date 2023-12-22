import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[] p = new int[N];
		int[] x = new int[M];
		int[] y = new int[M];

		for (int i = 0; i < N; i++) {
			p[i] = s.nextInt();
		}

		for (int i = 0; i < M; i++) {
				x[i] = s.nextInt();
				y[i] = s.nextInt();
		}
		Arrays.sort(p);

		int max = 0;
		int originMax = Math.max(max, count(p, N));

		for (int i = 0; i < M; i++) {
			System.out.println(" i :"+i+" p :"+Arrays.toString(swap(p, N, x[i], y[i])));
			originMax = Math.max(originMax,count(swap(p, N, x[i], y[i]), N));
		}

		System.out.println(originMax);

	}

	static int count(int[] p, int N) {
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (p[i] == i + 1) {
				count++;
			}
		}
		return count;

	}

	static int[] swap(int[] p, int N, int x, int y) {
		int[] newp = Arrays.copyOf(p, N);

		int tmp = newp[x - 1];
		newp[x - 1] = newp[y - 1];
		newp[y - 1] = tmp;

		return newp;
	}

}
