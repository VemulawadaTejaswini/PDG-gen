import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] s = sc.next().split("");
        boolean lastA = false;
        String ans = "No";
        for(String value : s) {
          if ("A".equals(value)) {
            lastA = true;
          } else if ("C".equals(value) && lastA) {
            ans = "Yes";
            break;
          } else {
            lastA = false;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}