import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int z = 0;

		if (a >= z) {
			z = a;
		}
		if (b >= z) {
			z = b;
		}
		if (c >= z) {
			z = c;
		}

		System.out.println(a + b + c - z + z * (int)Math.pow(2, k));
	}
}