import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
		int count = s.length() - s.replaceAll("1", "").length();
		// 出力
		System.out.println(count);
	}
}
