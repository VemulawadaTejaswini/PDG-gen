import java.util.*;

public class TwoRectangles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int s1 = a * b;
		int s2 = c * d;

		if (s1 >= s2) {
			System.out.println(s1);
		} else {
			System.out.println(s2);
		}
	}
}