
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		long min = Long.MAX_VALUE;
		long amount = 0;

		for (int i = 0; i < 1000000; i+=2) {
			amount = 0;
			amount += C*i;

			if (X > i/2) {
				amount+= (X-i/2)*A;
			}

			if (Y > i/2) {
				amount+= (Y-i/2)*B;
			}

			min = Math.min(min, amount);
		}

		System.out.println(min);

	}
}
