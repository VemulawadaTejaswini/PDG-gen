import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] s = sc.next().split("");
        String ans = "Yes";
        for (int i = 1; i <= s.length; i++) {
          if (i % 2 == 0 && s[i - 1].equals("R")) {
            ans = "No";
            break;
          } else if (i % 2 == 1 && s[i - 1].equals("L")) {
            ans = "No";
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}