import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();

		long max = 0;
		for (int i = 2; i >= 0; i--) {
			for (int j = 2; j >= 0; j--) {
				//System.out.println(n-i+" "+(7-j));
				long sell = 7 * (n - i) + (7-j)-7;
				//System.out.println(sell);
				max += sell;
			}
		}
		//System.out.println(max);


		long j = 0;
		long x = k;
		long pattern = 0;
		while (x <= max) {//一回数が見つかれば、あとは99を足していくだけでいい
			//System.out.println(x);
			if (!(x - 81 < 0) && (x - 81) % 9 == 0) {
				for (int i = 0; i < 5; i++) {
					if (((x - 81) / 9 - i) % 7 == 0 && ((x-71)/9-i)/4+1 <= n) {
						//System.out.println("縦"+(((x-71)/9-i)/4+1)+" 横"+(i+1));
						//System.out.println(x);
						pattern++;
					}
				}
			}

			x += 11;
		}

		System.out.println(pattern);
	}
}
