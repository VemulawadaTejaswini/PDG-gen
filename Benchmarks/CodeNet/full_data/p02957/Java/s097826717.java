import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int k = calc(a, b);

		if (k != -1) {
			System.out.println(k);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

	static int calc(int a, int b) {
		if (a - b == 0) {
			return a - b;
		}
		if ((a + b) % 2 == 0) {
			return (a + b) / 2;
		}
		return -1;
	}
}
