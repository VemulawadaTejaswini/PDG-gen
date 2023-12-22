import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String s = sc.next();
        int b = Integer.parseInt(sc.next());
      
      
      if (s.equals("+")) {
		// 出力
		System.out.println(a + b);
      } else if (s.equals("-")) {
        System.out.println(a - b);
      } else if (s.equals("*")) {
        System.out.println(a * b);
      } else if (s.equals(" / ") ) {
        if (b != 0) {
         System.out.println(a / b);
        }
      } else {
        System.out.println("error");
      }
    
	}
}