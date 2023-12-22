import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int nx = 0;
		while (x >= y+2*z) {
			x = x - z - y;
			nx++;
		}
		System.out.println(nx);
	}
}
