import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int r1 = Math.abs(a-x);
		int r2 = Math.abs(b-x);
		if (r1 >= r2) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
	}
}
