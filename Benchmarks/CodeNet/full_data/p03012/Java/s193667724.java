

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int N = Integer.parseInt(num);
		int[] W = new int[N];
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int S1 = 0;

		for(int i = 0; i < N; i++) {
			W[i] = Integer.parseInt(lines[i]);
			S1  = S1 + W[i];
		}

		S1 = S1 - W[N-1];
		int S2 = W[N-1];
		int min = 10000;

		for(int i = N-2; i > 0; i--) {
			int abs = Math.abs(S1 - S2);
			if(abs < min) {
				min = abs;
			}

			S1 = S1 - W[i];
			S2 = S2 + W[i];
		}


		System.out.println(min);
	}

}
