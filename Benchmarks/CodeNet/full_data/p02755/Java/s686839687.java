import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int percent8 = (int) (a / 0.08);
		int percent10 = (int) (b / 0.1);

		if (0 <= Math.max(percent8, percent10) - Math.min(percent8, percent10) && Math.max(percent8, percent10) - Math.min(percent8, percent10) < 9) {
			System.out.println(Math.max(percent8, percent10) - Math.min(percent8, percent10) + Math.min(percent8, percent10));
		} else {
			System.out.println("-1");
		}

	}
}