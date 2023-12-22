import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int bmin = Integer.MAX_VALUE;
		int ans = 0;
		for (int i = 0; i < m; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();

			if (bmin <= a) {
				ans++;
				bmin = Integer.MAX_VALUE;
			}
			bmin = Math.min(bmin, b);
		}
		System.out.println(ans + 1);
		scn.close();
	}
}