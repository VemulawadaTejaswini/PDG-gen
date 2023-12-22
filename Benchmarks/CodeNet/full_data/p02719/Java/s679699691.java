import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		sc.close();
		long minimum = n;
		do {
			if(minimum > n) minimum = n;
			if(n > k) {
				n = n % k;
			} else {
				long mod = k % n;
				if(mod != 0) n = mod;
			}
		} while(n < minimum && n > 0);
		if(n == 0) {
			System.out.println(n);
		} else {
			System.out.println(minimum);
		}
	}
}
