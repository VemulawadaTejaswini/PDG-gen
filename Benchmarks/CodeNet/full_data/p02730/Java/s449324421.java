import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		boolean ok = true;
		int N = S.length;
		// Sは回文であるか
		for(int i = 0; i < N; i++) {
			ok &= S[i] == S[N - i - 1];
		}
		// Sの1文字目から(N - 1)/2文字目まで(両端含む)からなる文字は回文であるか
		for(int i = 0; i < (N - 1) / 2; i++) {
			ok &= S[i] == S[(N - 1) / 2 - i - 1];
		}
		// Sの(N + 3)/2文字目からN文字目まで(両端含む)からなる文字は回文であるか
		// ※Sが回分であることが条件のため、Sの(N + 3)/2文字目移行の文字と1文字目～からが回分であればOK
		for(int i = (N + 3) / 2 - 1; i < N; i++) {
			ok &= S[i] == S[N - i - 1];
		}
		System.out.println(ok ? "Yes" : "No");
	}
}