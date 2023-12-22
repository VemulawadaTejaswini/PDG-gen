import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= N; k++) {
					int c = HCF(i, j);
					int d = HCF(c, k);
					sum = sum + d;
				}
			}
		}
		System.out.println(sum);

	}

	public static int HCF(int a, int b) {
		int temp = -1;
		int x = Math.max(a, b);
		int y = Math.min(a, b);
		while (x > 0) {
			temp = x;
			x = y % x;
			y = temp;
		}
		return y;
	}

}
