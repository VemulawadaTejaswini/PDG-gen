import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();

		int min = (d == 0) ? 1 : (int) Math.pow((double) 100, (double) d);
		System.out.println(min * n);

		sc.close();
	}
}