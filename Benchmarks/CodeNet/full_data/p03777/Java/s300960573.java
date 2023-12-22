import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String a = sc.next();
        String b = sc.next();
        String ans = "";
        if (a.equals("H")) {
          ans = b;
        } else {
          ans = b.equals("H") ? "D" : "H"; 
        }
    
		// 出力
		System.out.println(ans);
	}
}
