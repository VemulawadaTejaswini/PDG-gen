import java.io.PrintWriter;
//import java.util.Arrays;
import java.util.Scanner;
//import java.util.stream.IntStream;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		final String s;	// 2≦|s|≦10^5		s は小文字のアルファベットのみからなる。
		try(Scanner scan = new Scanner(System.in)) {
			s = scan.next();
		}
		
		// 部分文字列が「アンバランス」というのは、連続する2文字が同じ文字でその前後に違う文字が存在すれば、
		// 3文字で「アンバランス」な文字列になる。
		// 全て同じ文字でも良いから2文字で「アンバランス」な文字列になる。
		
		// s.length == 2でもそれは当てはまる。
		
		// それ以外でも離れていても「アンバランス」があるから		
		//IntStream.range(0, s.length()).filter(i -> s.charAt(i) == s.charAt(i + 1)).findFirst(); は使えない。
		
		// 1個飛ばしで存在していても良い。
		// 逆に2個飛ばしで存在していた場合、「アンバランス」なら、
		// そこまでを切り落としても「アンバランス」なはずである。
		
		int start = -1;
		int end = -1;
		
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				start = i + 1;	// i は1オリジン
				end = i + 1 + 1;
				break;				
			} else if (i + 2 < s.length() && s.charAt(i) == s.charAt(i + 2)) {
				start = i + 1;
				end = i + 2 + 1;
				break;
			}
		}
		
		
		// 各文字について検討する
		// 過半数を占めるためには文字Aから次の文字Aまでのm文字で区切った時、
		// その間の文字m/2以上文字Aがあればよい。
		// 逆に、その区間過半数ない場合は、さらに次の文字Aまで集計するにあたって
		// 過半数を取る助けにならないので破棄してよい。
		
		/* 各文字について検討する 方法は取らなくても良さそう。
		for (char c = 'a'; c <= 'z'; c++) {
			
			int start = 0;
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
				
			}
		}*/
		
		
		
		// 出力
		out.println(start + " " + end);
		out.close();
	}

}
