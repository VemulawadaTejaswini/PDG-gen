import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		n = n * (int)Math.pow(100, d);
		System.out.println(n);
	}
}