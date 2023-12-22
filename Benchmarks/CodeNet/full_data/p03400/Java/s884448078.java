import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		for (int i = 0 ; i < n ; i++) {
			x = x + (n-1) / sc.nextInt() + 1;
		}
		System.out.println(x);
	}
}
