import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = 0;
		int Q = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		Q = Integer.parseInt(sc.next());
		s = sc.next();
		int n;
		String Golem[] = new String[N];
		for (n = 0; n < N; n++) {
			Golem[n] = s.substring(n, n + 1);
		}
		int l = 0;
		int L = 0;
		int r = N - 1;
		int R = 0;
		int m = 0;
		String t[] = new String[Q];
		String d[] = new String[Q];
		for (n = 0; n < Q; n++) {
			t[n] = sc.next();
			d[n] = sc.next();
		}
		while (r > l) {
			// 左側
			m = (l + r) / 2;
			if (simulate(Golem, t, d, Q, m, N) == -1)
				l = m + 1;
			else
				r = m - 1;
		}
		L = r;
		l = 0;
		r = N - 1;
		while (r > l) {
			// 右側
			m = (l + r) / 2;
			if (simulate(Golem, t, d, Q, m, N) == 1)
				r = m - 1;
			else
				l = m + 1;
		}
		R = r;
		sc.close();
		System.out.println(R - L);
	}

	static int simulate(String Golem[], String t[], String d[], int Q, int m, int N) {
		int temp = 0;
		temp = m;

		for (int i = 0; i < Q; i++) {
			if (Golem[temp].equals(t[i])) {
				if (d[i].equals("R"))
					temp++;
				else
					temp--;
				if (temp < 0)
					return -1;// 左に落下
				if (temp >= N)
					return 1;// 右に落下
			}
		}
		return 0;
	}
}