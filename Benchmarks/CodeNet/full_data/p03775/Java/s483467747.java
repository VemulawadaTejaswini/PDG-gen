import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		long n = sc.nextLong();
		int min = String.valueOf(n).length();;
		int tmp = 0;
		for(long i = 1; i * i <= n; i++) {
			if(n%i == 0) {
				tmp = F(i, n/i);
				if(min > tmp) {
					min = tmp;
				}
			}
		}
		System.out.println(min);
	}

	public static int F(long a, long b) {
		if(a > b) {
			return String.valueOf(a).length();
		}else {
			return String.valueOf(b).length();
		}
	}
}