import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int count = 0;

		if (a==b) {
			if (b!=c) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		if (a==c) {
			if (b!=c) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		if (b==c) {
			if (b!=a) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");

	}
}
