import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int cntAC = 0;
		int cntWA = 0;

		int[] isAC = new int[n + 1];
		int[] WA = new int[n + 1];

		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if ("WA".equals(s)) {
				if (isAC[p] == 0) {
					WA[p]++;
				}
			} else {
				isAC[p] = 1;
			}
		}

		for (int i = 0; i < n + 1; i++) {
			cntAC += isAC[i];
			cntWA += WA[i];
		}

		System.out.println(cntAC + " " + cntWA);

		sc.close();
	}

}

