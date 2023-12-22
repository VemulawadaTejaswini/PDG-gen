import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String base = in.next();

		// AかBCの連続だけを取り出す
		Matcher m = Pattern.compile("A(A|BC)*BC").matcher(base);
		
		//@fmt:off
		int oldC = -1;	int newB = 1;	int cntA = 0;	int cnt = 0;
		//@fmt:on
		
		while ( m.find() ) {
			StringBuilder targ = new StringBuilder(m.group());					// ターゲットをひとつ取り出す

			do {
				newB = targ.indexOf("B", oldC + 1);	// Cより上で最初のBを見つけて
				cntA += newB - oldC - 1;				// これまでのAの総数（＝このBCの交換可能回数）を計算
				cnt += cntA;								// 全体の交換可能回数に加算して
				oldC = newB + 1;							// 次へ
			} while ( oldC < targ.length() - 1 );

			oldC = -1; newB = 1; cntA = 0;
		}

		System.out.println(cnt);
		in.close();
	}
}
