import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int d = a + b;
		int e = a + c;
		int f = b + c;

		if (d < e && d < f) {
			System.out.println(d);
		} else if (e < d && e < f) {
			System.out.println(e);
		} else if (f < d && f < e) {
			System.out.println("f");
		}

	}
}