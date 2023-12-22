import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		if (k > n) {
			long t = k;
			k = n;
			n = t;
		}
		long x = n%k;
		System.out.println(Math.min(x, k-x));
		sc.close();
	}

}
