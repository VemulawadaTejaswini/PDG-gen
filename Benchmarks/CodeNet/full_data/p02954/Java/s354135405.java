import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	String S;
	char[] s;
	int N;
	int[][] ikisaki;

	private void fun(int oe, int i) {
		if (ikisaki[oe][i] != -1) {
			return; //すでに計算済み
		}

		//いったりきたりを検出
		char c = s[i];

		if (c == 'R') {
			char cr = s[i+1];
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
				//Lがでてくるまで右に進む。Lが出てくる直前のRの地点より前は、すべて最終地点は直前のRの地点の行先と偶奇できまる
				int p=i;
				while(!( s[p] == 'R' && s[p+1] == 'R' && s[p+2] == 'L')) {
					p++;
				}
//				fun(0, p+1);
//				fun(1, p+1);
				ikisaki[0][p+1] = p+1;
				ikisaki[1][p+1] = p+2;

				for(int q=p;q>=i;q--) {
					ikisaki[0][q] = ikisaki[1][q+1];
					ikisaki[1][q] = ikisaki[0][q+1];
				}
				
//				//となりの最終地点が、iの最終地点でもある
//				fun(oe ^ 1, i + 1);
//				ikisaki[oe][i] = ikisaki[oe ^ 1][i + 1];
			}
		} else { //c=='L'
			char cl = s[i - 1];
			if (cl == 'R') {
				//いったりきたり
				if (oe == 0) {
					//今の場所が最終地点
					ikisaki[0][i] = i;
					
					//左から決まっていくので左を更新する必要はない
				} else {
					//となりが最終地点
					ikisaki[1][i] = i - 1;
					//左から決まっていくので左を更新する必要はない
				}
			} else {
				//となりの最終地点が、iの最終地点でもある
				ikisaki[oe][i] = ikisaki[oe ^ 1][i - 1];
				
				//左から決まっていくので左を更新する必要はない
			}
		}

		//いったりきたりではない
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		S = sc.next();
		s = S.toCharArray();
		
		sc.close();

		N = S.length();

		ikisaki = new int[2][N];
		Arrays.fill(ikisaki[0], -1);
		Arrays.fill(ikisaki[1], -1);

		fun(0,0);
		fun(1,0);
		for (int i = 1; i < N; i++) {
			for (int oe = 0; oe <= 1; oe++) {
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
