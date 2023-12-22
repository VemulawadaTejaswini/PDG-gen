import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		String[] a = new String[h];
		for (int i = 0; i < h; i++) {
			a[i] = scan.next();
		}
		String b = "";
		for (int i = 0; i <w+ 2; i++) {
			b = b+"#";
		}
		System.out.println(b);
		for (int i = 0; i < h; i++) {
			System.out.println("#"+a[i]+"#");
		}
		System.out.println(b);
	}
}
