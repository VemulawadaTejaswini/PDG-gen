import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int X = sc.nextInt();

		int num = a + b;
		if (a <= X && X <= num) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
