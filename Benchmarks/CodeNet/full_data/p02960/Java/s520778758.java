import java.util.Scanner;

public class Main {

	static int	ans	= 0;
	static int	mod	= (int) 1E9 + 7;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();

		listUpPossibleNum(s);

		System.out.println(ans);
		in.close();
	}

	private static void listUpPossibleNum(String base) {
		int targIdx = base.indexOf('?');
		if ( targIdx == -1 ) {
			if ( getRemainderOfBigDivision(base, 13) == 5 ) {
				ans++;
				if ( ans > mod ) ans %= mod;
			}
			return;
		}

		char[] c = base.toCharArray();
		for ( int i = 0; i < 10; i++ ) {
			c[targIdx] = (char) ('0' + i);
			listUpPossibleNum(String.valueOf(c));
		}
	}

	// 文字列化された巨大数 targ を div で割った余りを求める
	private static int getRemainderOfBigDivision(String targ, int div) {
		while ( targ.length() >= 10 ) {
			int t1 = Integer.parseInt(targ.substring(0, 9));
			targ = String.valueOf(t1 % div) + targ.substring(9);
		}
		return Integer.parseInt(targ) % div;
	}
}
