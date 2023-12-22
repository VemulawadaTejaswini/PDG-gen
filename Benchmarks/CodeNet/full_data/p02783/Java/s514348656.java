import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		double h = sc.nextDouble();
		double a = sc.nextDouble();
		System.out.println((int) Math.ceil(h / a));
	}
}
