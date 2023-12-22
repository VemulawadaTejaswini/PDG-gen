import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int s = n % 2;
		int t;
		if (s == 0)
			t = n;
		else
			t = 2 * n;

		System.out.println(t);
	}
}
