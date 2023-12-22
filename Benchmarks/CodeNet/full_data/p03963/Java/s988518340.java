import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = scanner.nextDouble();
		double k = scanner.nextDouble();
		double cnt = k * Math.pow(k - 1, n-1);
		System.out.println((int)cnt);
	}
}