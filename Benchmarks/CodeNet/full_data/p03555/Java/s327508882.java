import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.next();
            String str2 = sc.next();
            StringBuffer str = new StringBuffer(str1);
        	String str3 = str.reverse().toString();
        
            if(str3.equals(str2)){
              System.out.println("YES");
            } else {
              System.out.println("NO");
            }
          }
}