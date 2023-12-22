import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int n = 1;

		while (b > a + (a - 1) * (n - 1))
			n++;

		System.out.println(n);

	}
}