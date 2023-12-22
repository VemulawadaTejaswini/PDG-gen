import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int g = H - a;
		int r = W - b;

		System.out.println(g * r);

		sc.close();

	}
}
