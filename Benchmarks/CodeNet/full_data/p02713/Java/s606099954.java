
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;

		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				for(int k = 1; k <= N; k++) {
					sum = sum + GcdMethod(i, j, k);
				}
			}
		}

		System.out.println(sum);
	}

	public static int GcdMethod(int i, int j, int k) {
		int gcdNum = 1;
		int ans = gcd(k, j);
		gcdNum = gcd(ans, i);
		return gcdNum;
	}

	public static int gcd(int x, int y) {
		return y>0?gcd(y,x%y):x;
	}
}
