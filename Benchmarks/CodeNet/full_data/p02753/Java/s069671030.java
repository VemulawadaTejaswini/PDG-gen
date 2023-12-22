package atCoderBeginnerContest158;

import java.util.Scanner;

/**
 *
 * https://atcoder.jp/contests/abc158/tasks/abc158_a
 *
 * @author shouma
 *
 */

public class A_StationAndBus {
	public static void main(String args[]) {
		//strにはAかBの文字列が入る。(３文字)
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//小文字が入る場合があるので、変換する。
		String upperStr = str.toUpperCase();
		if(upperStr.length() <= 3) {
		//AAAのみやBBBのみだと、バスは運行しない→Noを出力
			if(upperStr.contains("AAA") || upperStr.contains("BBB")){
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
		System.out.println("文字が３文字以上です。");
        scan.close();
	}
}
