import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int d = (int)Math.sqrt(x);
		d = d * d;
		System.out.println(d);
	}
}