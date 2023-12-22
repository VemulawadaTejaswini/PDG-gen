import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  // 文字列の入力
	  String s = sc.next();
      
      char[] c = s.toCharArray();

      for(int i = 0; i < s.length()-1; i++) {
        if(c[i] == c[i+1]) {
          System.out.println("Bad");
          return;
        }
      }
      System.out.println("Good");
      
	}
}