import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
      int b = 'Z';
      char c;
      int d;
      int e = s.length();
      String s_ = "";
      for (; e != 0; e--) {
      	c = s.charAt(e-1);
        d = c + a;
        if (d > b) {
          d -= 26;
        }
      	s_ = String.valueOf(d) + s_;
        }
      // 出力
		System.out.println(s_);
      
	}
}