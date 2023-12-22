import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		int N = S.length;
		boolean ok1 = true, ok2 = true;
		int m = (N - 1) / 2;
		for(int i = 0; i < m; i++) {
			// System.out.println(S[i] + " " +  S[m - 1]);
			if(S[i] != S[m - 1]) ok1 = false;
			m--;
		}
		// System.out.println("---------");
		m = N - 1;
		for(int i = (N + 3) / 2 ; i - 1 < N; i++) {
			// System.out.println(S[i - 1] + " " +  S[m]);
			if(S[i - 1] != S[m]) ok2 = false;
			m--;
		}
		// System.out.println(ok1 + " " + ok2);
		System.out.println(ok1 && ok2 ? "Yes" : "No");
	}
}
