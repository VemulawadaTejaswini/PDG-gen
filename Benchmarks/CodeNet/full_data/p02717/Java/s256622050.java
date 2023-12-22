
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int t = 0;

		t = a;
		a = b;
		b = t;

		t = a;
		a = c;
		c = t;

		System.out.println(a + " " + b + " " + c);

	}

}
