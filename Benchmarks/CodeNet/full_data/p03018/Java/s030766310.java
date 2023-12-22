import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String base = in.next();

		// AかBCの連続だけを取り出す
		Matcher m = Pattern.compile("A(A|BC)*BC").matcher(base);

		int oldC, newB, cnt;
		oldC = newB = cnt = 0;

		while ( m.find() ) {
			String targ = m.group();					// ターゲットをひとつ取り出す
			
			do {
				newB = targ.indexOf("B", oldC + 1);		// Cより上で最初のBを見つけて
				cnt += newB - oldC;  					// 間のAの個数を加算
				oldC = newB + 1;						// 次へ
			} while ( oldC < targ.length() - 1 );

			oldC = newB = 0;
		}
		
		System.out.println(cnt);
		in.close();
	}
}