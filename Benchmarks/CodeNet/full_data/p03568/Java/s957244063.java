import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 1;
		int bs = 1;
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			if (b % 2 == 0) {
				bs *= 2;
			}
			total *= 3;
		}
		System.out.println(total - bs);
	}
}
