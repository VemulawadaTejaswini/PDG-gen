import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String s = sc.next();
       
        if (s.length() == 2) {
          // 出力
		  System.out.println(s);
        } else {
          String[] list = s.split("");
          System.out.println(list[2] + list[1] + list[0]);
        }
	}
}