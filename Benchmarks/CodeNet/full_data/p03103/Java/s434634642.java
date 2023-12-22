import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] split = s.split(" ");
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			s = sc.nextLine();
			split = s.split(" ");
			a[i] = Integer.parseInt(split[0]);
			b[i] = Integer.parseInt(split[1]);
		}

		long c = 0;
		for (int j = 0; j < M; j++) {
			int minA = Integer.MAX_VALUE;
			int minID = 0;
			for (int i = 0; i < N; i++) {
				if (a[i] <= minA && b[i] != 0) {
					minA = a[i];
					minID = i;
				}
			}
			c += minA;
			b[minID]--;
		}

		System.out.println(c);

		sc.close();
	}
}