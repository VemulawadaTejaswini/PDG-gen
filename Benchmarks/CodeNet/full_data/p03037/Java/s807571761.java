

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		int[] L = new int[M];
		int[] R = new int[M];

		for(int i = 0 ; i < M ; i++) {
			line = sc.nextLine();
			lines = line.split(" ");
			L[i] = Integer.parseInt(lines[0]);
			R[i] = Integer.parseInt(lines[1]);
		}

		int Left = L[0];
		int Right = R[0];
		for(int i = 0; i < M; i++) {
			if(Left < L[i]) {
				Left = L[i];
			}
			if(Right > R[i]) {
				Right = R[i];
			}
		}

		if(Right- Left < 0) {
			System.out.println(0);
		}else {
			System.out.println(Right - Left + 1);
		}

	}

}
