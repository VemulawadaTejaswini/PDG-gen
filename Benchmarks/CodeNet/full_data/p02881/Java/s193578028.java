import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long div = (int) Math.sqrt(n);

		while (div > 0) {
			if (n % div == 0) {
				long ans = (div + (n / div) - 2);
				System.out.println(ans);
				return;
			}else {
				div--;
			}
		}
	}
}