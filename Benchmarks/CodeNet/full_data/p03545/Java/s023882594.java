
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = Integer.valueOf(String.valueOf(s.charAt(0)));
		int b = Integer.valueOf(String.valueOf(s.charAt(1)));
		int c = Integer.valueOf(String.valueOf(s.charAt(2)));
		int d = Integer.valueOf(String.valueOf(s.charAt(3)));
		if(a + b + c + d == 7) {
			System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + (a + b + c + d));
			return;
		} else if(a + b + c - d == 7) {
			System.out.println(a + "+" + b + "+" + c + "-" + d + "=" + (a + b + c - d));
			return;
		} else if(a + b - c + d == 7) {
			System.out.println(a + "+" + b + "-" + c + "+" + d + "=" + (a + b - c + d));
			return;
		} else if(a - b + c + d == 7) {
			System.out.println(a + "-" + b + "+" + c + "+" + d + "=" + (a - b + c + d));
			return;
		} else if(a + b - c - d == 7) {
			System.out.println(a + "+" + b + "-" + c + "-" + d + "=" + (a + b - c - d));
			return;
		} else if(a - b + c - d == 7) {
			System.out.println(a + "-" + b + "+" + c + "-" + d + "=" + (a - b + c - d));
			return;
		} else if(a - b - c + d == 7) {
			System.out.println(a + "-" + b + "-" + c + "+" + d + "=" + (a - b - c + d));
			return;
		} else if(a - b - c - d == 7) {
			System.out.println(a + "-" + b + "-" + c + "-" + d + "=" + (a - b - c - d));
			return;
		}
		System.out.println(1);
	}
}