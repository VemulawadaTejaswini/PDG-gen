import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a < b) {
			System.out.print(a + " ");
		} else {
			System.out.print(b + " ");
		}

		if (a + b <= n) {
			System.out.println(0);
		} else {
			System.out.println(a + b - n);
		}
	}
}
