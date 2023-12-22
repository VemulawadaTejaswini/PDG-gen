import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, X, Y;
		n = sc.nextInt();
		m = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();
		int x[] = new int[110], y[] = new int[110];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
		}

		boolean ok = false;
		for (int z = X + 1; z <= Y; z++) {
			boolean dame = false;
			for (int i = 0; i < n; i++) {
				if (x[i] >= z) {
					dame = true;
				}
			}
			for (int i = 0; i < m; i++) {
				if (y[i] < z) {
					dame = true;
				}
			}
			if (!dame) {
				ok = true;
				break;
			}
		}

		if (ok) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}

		sc.close();
	}
}