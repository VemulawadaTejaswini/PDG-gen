import java.util.Scanner;

public class Main {
	public static int Max(int a, int b, int c) {
		int m = a;
		if (m < b)
			m = b;
		if (m < c)
			m = c;
		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = a + b + c;
		int max = Max(a, b, c);
		System.out.println(ans + 9 * max);
	}
}
