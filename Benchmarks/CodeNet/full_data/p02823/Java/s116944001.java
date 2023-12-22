import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long ret = 0;
			// 離れ方が偶数の場合
			if((b - a) % 2 == 0) {
				ret = (b - a) / 2;
			} else {
				// aの端までの回数
				long aMax = a - 1;
				// bの端までの回数
				long bMax = n - b;
				if(aMax < bMax) {
					ret += aMax;
					ret += 1;
					ret += (b - a - 1) / 2;
				} else {
					ret += bMax;
					ret += 1;
					ret += (b - a - 1) / 2;
				}
			}
			System.out.println(ret);
		}

	}

}
