import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// input
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		int res = (a + b) % 24;
		// output
		System.out.println(res);
	}
}