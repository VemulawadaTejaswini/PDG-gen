import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int nc = n * (n - 1) / 2;
		int mc = m * (m - 1) / 2;

		System.out.println(nc + mc);
	}
}
