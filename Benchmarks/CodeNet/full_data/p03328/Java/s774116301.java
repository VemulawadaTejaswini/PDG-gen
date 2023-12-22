import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = b - a;
		int bhight = 0;
		for (int i = 1; i <= c; i++) {
			bhight += i;
		}
		System.out.println(bhight - b);
	}
}
