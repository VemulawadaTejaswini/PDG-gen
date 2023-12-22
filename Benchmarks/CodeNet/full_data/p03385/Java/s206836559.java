import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String t = stdin.next();
		boolean a = false;
		boolean b = false;
		boolean c = false;
		if (t.charAt(0) == 'a') {
			a = true;
		}
		if (t.charAt(0) == 'b') {
			b = true;
		}
		if (t.charAt(0) == 'c') {
			c = true;
		}
		if (t.charAt(1) == 'a') {
			a = true;
		}
		if (t.charAt(1) == 'b') {
			b = true;
		}
		if (t.charAt(1) == 'c') {
			c = true;
		}
		if (t.charAt(2) == 'a') {
			a = true;
		}
		if (t.charAt(2) == 'b') {
			b = true;
		}
		if (t.charAt(2) == 'c') {
			c = true;
		}
		if(a&&b&&c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
