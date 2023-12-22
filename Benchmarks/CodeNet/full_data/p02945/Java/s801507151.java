import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c = a + b;
		int d = a - b;
		int e = a * b;

		int max1 = Math.max(c, d);
		int max2 = Math.max(max1, e);

		System.out.println(max2);

	}
}