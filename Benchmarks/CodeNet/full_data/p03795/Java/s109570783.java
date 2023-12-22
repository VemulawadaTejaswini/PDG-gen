import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, x, y;
		N = sc.nextInt();

		x = 800 * N;
		y = 200 * (N / 15);

		System.out.print(x - y);
	}
}