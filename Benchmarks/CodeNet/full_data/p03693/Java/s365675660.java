import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
			final int num1 = cin.nextInt();
			final int num2 = cin.nextInt();
			final int num3 = cin.nextInt();
			final int num = num1 * 100 + num2 * 10 + num3;

			if (num % 4 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
	}

}
