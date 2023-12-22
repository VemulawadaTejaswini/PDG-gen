import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		int zen = 0;
		int kou = 0;
		//		int x=1;int y=1;//syokiichi
		for (int i = 1; i <= h - a; i++) {
			zen = kaizyou(b + i - 2) / (kaizyou(b - 1) * kaizyou(i - 1));
			kou = kaizyou(h + w - i - b - 1) / (kaizyou(h - i) * kaizyou(w - b - 1));
			//			System.out.println(zen);
			//			System.out.println(kou);
			ans += zen * kou;
		}
		System.out.println(ans % ((int) Math.pow(10, 9) + 7));

	}

	public static int kaizyou(int n) {
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= i;
		}
		return ans;
	}

}
