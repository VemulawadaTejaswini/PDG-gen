import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int total = A * X + B * Y;
		if (X > Y) {
			for (int i = 0; i <= 2 *X ;  i += 2) {

				if (total > A * Math.max(0, X - 0.5 * i) + B * Math.max(0, Y - 0.5 * i) + C * i) {
					total = (int) (A * Math.max(0, X - 0.5 * i)+ B * Math.max(0, Y - 0.5 * i) + C * i);
				}
			}
		} else {
			for (int i = 0; i <=  2 *Y; i += 2) {
				if (total > A * Math.max(0, X - 0.5 * i) + B * Math.max(0, Y - 0.5 * i) + C * i) {
					total = (int) (A * Math.max(0, X - 0.5 * i) + B * Math.max(0, Y - 0.5 * i) + C * i);
				}
			}
		}
		System.out.println(total);

	}
}
