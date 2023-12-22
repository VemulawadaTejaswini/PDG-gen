import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();
			int M = scn.nextInt();
			int[] Ai = new int[M];

			int sum = 0;
			for(int i = 0; i < M; i++) {
				Ai[i] = scn.nextInt();
				sum = sum + Ai[i];
			}

			if(N < sum) {
				System.out.println(-1);
			}else {
				System.out.println(N-sum);
			}
		}
	}
}