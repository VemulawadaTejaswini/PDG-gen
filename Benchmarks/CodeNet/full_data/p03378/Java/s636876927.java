import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();

		boolean a[] = new boolean[n];
		for (int i = 1, cnt = 0; cnt < m; cnt++, i++) {
			int an = sc.nextInt();
			while (an != i) i++;
			a[i] = true;
		}

		int cntA = 0;
		int cntB = 0;
		for (int i = 0; i < x; i++) {
			if (a[i]) cntA++;
		}
		for (int i = x + 1; i < n; i++) {
			if (a[i]) cntB++;
		}
		if (cntA > cntB)
			System.out.println(cntB);
		else
			System.out.println(cntA);
	}
}
