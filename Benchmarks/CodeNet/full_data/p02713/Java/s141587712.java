import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();
		int a = 0, b = 0, c = 0, ans = 0;
		for(int i = 1; i <= K; i++) {
			a = i;
			for(int j = 1; j <= K ; j++) {
				b = j;
				for(int n = 1; n <= K ; n++) {
					c = n;
					int g = gcd(a, b);
					ans += gcd(g, c);
				}
			}
		}
		System.out.println(ans);
	}
    /**
     * 整数値x,yの最大公約数を求めて返却
     * @param x
     * @param y
     * @return 最大公約数
     */
    public static int gcd(int x, int y) {
        // System.out.println("x = " + x + " y = " + y);
		return y == 0 ? x : gcd(y, x % y);
    }
}