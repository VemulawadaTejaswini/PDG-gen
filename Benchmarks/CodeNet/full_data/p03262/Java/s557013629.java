import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[] distance = new int[N];
		for (int i = 0; i < distance.length; i++) {
			distance[i] = Math.abs(X - scan.nextInt());
		}
		System.out.println(exGcd(distance));
	}

	public static int exGcd(int[] a) {
		if (a.length == 1) {
			return a[0];
		}

		int gcdResult = gcd(a[0], a[1]);
		for (int i = 2; i < a.length; i++) {
			gcdResult = gcd (gcdResult, a[i]);
		}
		return gcdResult;
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		int c = a % b;
		if (c == 0) {
			return b;
		}

		return gcd(b, c);

	}
}
