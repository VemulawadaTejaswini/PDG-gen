import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int move = 0;
		if(a > b) {
			int c = a;
			a = b;
			b = c;
		}
		if(a + w >= b) {
			move = 0;
		} else {
			move = b - (a + w);
		}
		System.out.println(move);
	}
}