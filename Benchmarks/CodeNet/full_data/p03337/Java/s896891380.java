import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = 0;
		if (a + b > n) {
			n = a + b;
		}
		if (a - b > n) {
			n = a - b;
		}
		if (a * b > n) {
			n = a * b;
		}
		System.out.println(n);
	}

}