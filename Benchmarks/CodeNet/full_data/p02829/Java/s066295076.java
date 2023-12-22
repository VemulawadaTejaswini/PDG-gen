import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
//		long ans = 0;
		int ans = 0;

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int k = sc.nextInt();
//		int k = sc.nextInt();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//

//		int[] b = new int[n];
//		int[][] aa = new int[h][w];
//		int[] bb = new int[n];
//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < n; i++) {
//			b[i] = sc.nextInt();
//			bb[i] = b[i];
//		}

		if(n == 1 || k == 1) {
			if(k == 2 || n == 2) {
				ans = 3;
			} else {
				ans = 2;
			}
		} if (n == 2||k == 2) {
			if(n == 3|| k == 3) {
				ans = 1;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}