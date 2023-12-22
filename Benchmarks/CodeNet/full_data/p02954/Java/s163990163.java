import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	String S;
	int N;
	int[][] ikisaki;

	private void fun(int oe, int i) {
		if (ikisaki[oe][i] != -1) {
			return; //すでに計算済み
		}

		//いったりきたりを検出
		char c = S.charAt(i);

		if (c == 'R') {
			char cr = S.charAt(i + 1);
			if (cr == 'L') {
				//いったりきたり
				if (oe == 0) { //偶数
					//今の場所が最終地点
					ikisaki[0][i] = i;
					//となりも記録する（左隣の最終地点は（奇数）は、今の場所）
					ikisaki[1][i + 1] = i;
				} else {
					//となりが最終地点
					ikisaki[1][i] = i + 1;
					ikisaki[0][i + 1] = i + 1;
				}
			} else {
				//となりの最終地点が、iの最終地点でもある
				fun(oe ^ 1, i + 1);
				ikisaki[oe][i] = ikisaki[oe ^ 1][i + 1];
			}
		} else { //c=='L'
			char cl = S.charAt(i - 1);
			if (cl == 'R') {
				//いったりきたり
				if (oe == 0) {
					//今の場所が最終地点
					ikisaki[0][i] = i;
					//となりも記録する（左隣の最終地点は（奇数）は、今の場所）
					ikisaki[1][i - 1] = i;
				} else {
					//となりが最終地点
					ikisaki[1][i] = i - 1;
					ikisaki[0][i - 1] = i - 1;
				}
			} else {
				//となりの最終地点が、iの最終地点でもある
				fun(oe ^ 1, i - 1);
				ikisaki[oe][i] = ikisaki[oe ^ 1][i - 1];
			}
		}

		//いったりきたりではない
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		S = sc.next();

		sc.close();

		N = S.length();

		ikisaki = new int[2][N];
		for (int i = 0; i < N; i++) {
			Arrays.fill(ikisaki[0], -1);
			Arrays.fill(ikisaki[1], -1);
		}

		for (int oe = 0; oe <= 1; oe++) {
			for (int i = 0; i < N; i++) {
				fun(oe, i);
			}
		}

		int[] ans = new int[N];

		for (int i = 0; i < N; i++) {
			ans[ikisaki[0][i]]++;
		}

		out.println(join(" ", ans));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}
}
