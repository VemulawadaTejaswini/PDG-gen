import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] Aline = new int[N];
		int[] Bline = new int[N];

		Aline[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {
			Aline[i] += sc.nextInt() + Aline[i-1];
		}


		Bline[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {
			Bline[i] += sc.nextInt() + Bline[i-1];
		}
		int max = 0;
		int amount = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				amount = Aline[i] + Bline[N-1];
			}else {
				amount = Aline[i] + Bline[N-1] - Bline[i-1];
			}

			max = Math.max(max, amount);

		}
		System.out.println(max);

	}
}
