import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] s = sc.next().split("");
        String ans = s[0];
        ans += s.length - 2;
        ans += s[s.length - 1];
    
		// 出力
		System.out.println(ans);
	}
}