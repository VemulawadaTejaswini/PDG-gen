import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double t025 = sc.nextDouble();
		double t05 = sc.nextDouble();
		double t1 = sc.nextDouble();
		double t2 = sc.nextDouble();

		int n = sc.nextInt();

		double one = Math.min(t1, t025 * 4);
		one = Math.min(one, t05 * 2);

		double two = Math.min(one * 2, t2);

		System.out.println( (long)(n % 2 * one+n / 2 * two));
	}

}
