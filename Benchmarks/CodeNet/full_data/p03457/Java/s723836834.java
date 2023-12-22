import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int[n + 1];
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];

		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		String ans = "Yes";
		int jik, xky, yky, sou, a;
		for (int i = 1; i <= n; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			jik = t[i] - t[i - 1];// jikの移動回数で
			xky = Math.abs(x[i] - x[i - 1]);// x移動距離
			yky = Math.abs(y[i] - y[i - 1]);// y移動距離
			sou = yky + xky;
			if (sou > jik) {
				ans = "No";
			} else {// sou<=jik
				a = jik - sou;
				if (a % 2 != 0) {
					ans = "No";
				}
			}

		}
		System.out.println(ans);

	}
}