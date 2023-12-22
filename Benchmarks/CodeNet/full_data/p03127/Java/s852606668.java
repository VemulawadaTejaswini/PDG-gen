import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int minHp = sc.nextInt();
		for (int i = 0; i < N - 1; i++) {
			minHp = gcd(minHp, sc.nextInt());
		}

		System.out.println(minHp);

	}

	public static int gcd(int a, int b) {
	    if (b == 0) return Math.abs(a);
	    return gcd(b, a % b);
	}
}
