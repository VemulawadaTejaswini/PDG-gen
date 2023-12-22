import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 1; i < 1300; i++) {
			int xa = (int) (i * 0.08D);
			int xb = (int) (i * 0.1D);
			if (a == xa && b == xa) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}
