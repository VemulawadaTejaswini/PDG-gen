import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] networkNum = new int[n];
		int[] color = new int[n - 1];
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			networkNum[a - 1]++;
			networkNum[b - 1]++;
			color[i - 1] = Math.max(networkNum[a - 1], networkNum[b - 1]);
		}

		// 入力ここまで、K計算
		int k = 0;
		for (int i = 0; i < n; i++) {
			k = Math.max(k, networkNum[i]);
		}
		System.out.println(k);
		for (int i = 0; i < n - 1; i++) {
			System.out.println(color[i]);
		}
	}
}