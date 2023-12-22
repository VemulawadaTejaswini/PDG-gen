import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long n = sc.nextLong();
		long sum;
		if (n % 11 <= 6) {
			sum = n / 11;
			sum = sum * 2 + 1;
		} else {
			sum = n / 11;
			sum = sum * 2 + 2;
		}
		System.out.println(sum);
	}
}
