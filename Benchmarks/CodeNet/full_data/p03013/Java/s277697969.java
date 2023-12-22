import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int N, M;
	private static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int[] a = new int[N + 1];
		Arrays.fill(a, 0);
		for (int i = 0; i < M; i++) {
			a[sc.nextInt()] = 1;
		}

		/*
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		*/

		check(0 , a);

		System.out.println(cnt % 1000000007);
	}

	private static void check(int step, int[] a) {
		if (step == N) {
			cnt++;
			return;
		} else if(step > N) {
			return;
		}

		if (a[step] == 1) {
			//System.out.println("引っかかった");
			return;
		}

		check(step + 1, a);
		check(step + 2, a);
	}
}