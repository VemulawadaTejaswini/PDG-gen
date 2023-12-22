import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		String[] a = sc.next().split("");
		String[] b = sc.next().split("");
      
        // 長さとか一文字目ずつ比較して確認する
        String ans = "";
        if (a.length > b.length) {
          ans = "GREATER";
        } else if (a.length < b.length) {
          ans = "LESS";
        } else {
          for(int i = 0; i < a.length; i++) {
            int aValue = Integer.parseInt(a[i]);
            int bValue = Integer.parseInt(b[i]);
            if (aValue > bValue) {
              ans = "GREATER";
              break;
            } else if (aValue < bValue) {
              ans = "LESS";
              break;
            } else if (i == a.length - 1) {
              ans = "EQUAL";
            }
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}