import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] d = new int[n];

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		boolean[] used = new boolean[n];

		boolean isCpl = true;
		outer:
		for (int i = 0; i < m; i++) {
			int t = sc.nextInt();

			for (int j = 0; j < n; j++) {
				if (!used[j] && d[j] == t) {
					used[j] = true;
					continue outer;
				}
			}

			isCpl = false;
			break;
		}

		System.out.println(isCpl ? "YES" : "NO");

		sc.close();
	}

}
