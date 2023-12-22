import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a % 2 != b % 2) {
			System.out.println("IMPOSSIBLE");
		} else {
			System.out.println((a + b) / 2);
		}
		sc.close();
	}

}
