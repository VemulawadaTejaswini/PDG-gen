import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ret = 0;
			// 離れ方が偶数の場合
			if((a - b) % 2 == 0) {
				ret = Math.abs(a - b) / 2;
			} else {
				// aの端までの回数
				int aMax = a - 1;
				// bの端までの回数
				int bMax = n - b;
				if(aMax < bMax) {
					ret = b - 1;
				} else {
					ret = n - a;
				}
			}
			System.out.println(ret);
		}

	}

}
