import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int ans = 100100;
		for(long i = 1 ; i * i <= n ; i++) {
			if(n % i == 0) {
				ans = Math.min(ans, kouta(i, n / i));
			}
		}
		System.out.println(ans);
	}

	public static int kouta(long i, long j) {
		int ret = 0;
		if(i >= j) {
			while(i > 0) {
				ret++;
				i /= 10;
			}
		} else {
			while(j > 0) {
				ret++;
				j /= 10;
			}
		}
		return ret;
	}

}
