import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long cnt = Long.MAX_VALUE;
		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				cnt = (i - 1) + (n / i - 1);
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
