import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0;
		if (a == b) {
			x = c;
		} else if (b == c) {
			x = a;
		} else {
			x = b;
		}
		System.out.println(x);
	}
}
