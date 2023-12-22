

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int N = Integer.parseInt(str);
		int[] city = new int[N + 1];
		int[] hero = new int[N + 1];

		String line = sc.nextLine();
		String[] A = line.split(" ");
		line = sc.nextLine();
		String[] B = line.split(" ");

		for (int i = 0; i < city.length - 1; i++) {
			city[i] = Integer.parseInt(A[i]);
			hero[i] = Integer.parseInt(B[i]);
		}
		city[N] = Integer.parseInt(A[N]);
		hero[N] = 0;

		int count = 0;
		int enjo = 0;
		for (int i = 0; i < hero.length; i++) {
			hero[i] = hero[i] + enjo;

			while (city[i] != 0 && hero[i] != 0) {
				city[i] = city[i] - 1;
				hero[i] = hero[i] - 1;
				count++;
			}
			if (hero[i] != 0) {
				enjo = hero[i];
			}
		}

		System.out.println(count);
	}
}
