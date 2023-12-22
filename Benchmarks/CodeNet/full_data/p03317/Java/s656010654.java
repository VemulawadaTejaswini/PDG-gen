import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c[] = new int[a];;
		for (int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}

		int count = 0;
		a -= b;
		count++;
		while (a > 0) {
			a = a - (b - 1);
			count++;
		}

		System.out.println(count);
	}
}
