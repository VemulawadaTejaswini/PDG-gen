import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		int max = a;
		int sum = 0;
		int num1 = b;
		int num2 = c;

		if (a < b) {
			num1 = a;
			num2 = c;
			max = b;
		} else if (a < c) {
			num1 = a;
			num2 = b;
			max = c;
		}

		for (int i=0; i<x; i++) {
			max = max*2;
		}

		sum = num1 + num2 + max;

		System.out.println(sum);

		scan.close();

	}

}
