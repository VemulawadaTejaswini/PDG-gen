import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean result = true;

		int ti = 0;
		int xi = 0;
		int yi = 0;

		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			int ta = Math.abs(t - ti);
			int xa = Math.abs(x - xi);
			int ya = Math.abs(y - yi);

			if (ta < xa + ya
				|| ta % 2 != (xa + ya) % 2) {
				result = false;
				break;
			}

			ti = t;
			xi = x;
			yi = y;
		}

		System.out.println(result ? "Yes" : "No");
	}
}