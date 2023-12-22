import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double d = Math.sqrt(x);
		x = (int)d * (int)d;
		System.out.println(x);
	}
}