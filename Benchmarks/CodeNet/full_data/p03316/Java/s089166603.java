import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b[] = new int[100];
		int i = 0;
		int sum = 0;
		int c = a;

		while (c != 0) {
			b[i++] = c % 10;
			c /= 10;
		}

		for (int j = 0; j < i; j++) {
			sum += b[j];
		}

		if (a % sum == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}