import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		String s = sc.next();
		String t = sc.next();

		String s1 ="";
		String ans ="No";
		int cnt = 0;

		while (cnt < s.length()){
			if (s.equals(t)) {
				ans = "Yes";
				break;
			} else {
				s1 = s.substring(0,1);
				s = s.substring(1) + s1;
			}
			cnt++;
		}
		// 出力
		System.out.println(ans);
	}
}