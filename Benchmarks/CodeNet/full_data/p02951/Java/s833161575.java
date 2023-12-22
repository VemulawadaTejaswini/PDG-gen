import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int tmp = a - b;
		int ans = c - Math.min(c, tmp);

		System.out.println(ans);
	}
}