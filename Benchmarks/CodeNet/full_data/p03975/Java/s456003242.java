import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (a <= x && x < b) {
				count++;
			}
		}
		System.out.println(n - count);
	}
}
