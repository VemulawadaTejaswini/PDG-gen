import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int blue = 0;
		blue = a * n / (a + b);
		n = n % (a + b);
		blue += Math.min(a, n);
		System.out.println(blue);
		sc.close();
	}
}