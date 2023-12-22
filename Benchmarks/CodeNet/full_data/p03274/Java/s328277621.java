package bhe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);

		String[] temp2 = scanner.nextLine().split(" ");
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(temp2[i]);
		}


		int l = 0;
		int r = 0;
		int koko = 0;
		int ans = 0;
		for(int i = 0; i < n - k + 1; i++) {
			l = i - k -1;
			r = i;
			koko = Math.min(
							Math.abs(list[l]) + Math.abs(list[l] - list[r]),
							Math.abs(list[r]) + Math.abs(list[r] - list[l]));
			ans = Math.min(ans, koko);
		}
		System.out.println(ans);

	}
}