import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		sc.close();
		if (a - b <= d && b - c <= d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
