import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double all = a + b;
		double wari = n / all;
		wari = wari * a;
		double amari = n % all;
		double hasuu = a > amari ? amari : a;
		System.out.println(wari + hasuu);

		sc.close();
	}

}
