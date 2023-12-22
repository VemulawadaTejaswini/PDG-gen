import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int a = scan.nextINt();
		int c =0;
		for (int i = 1; a < h; i++) {
		    h -= a;
		    c++;
		}
		System.out.println(c);
	}
}