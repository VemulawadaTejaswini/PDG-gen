import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
int c = 0;
		if (a > b) {
			c += a;
			a--;
		} else {
			c += b;
			b--;
		}
		if (a > b) {
			c += a;
			a--;
		} else {
			c += b;
			b--;
		}
		System.out.println(c);
	}
}