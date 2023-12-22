import java.util.*;

import sun.font.TrueTypeFont;

import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      // String str = sc.next();
      // int i = str.split("x").length;
      // out.println(700 + i * 100);

      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();

      int result =  A * X + B * Y;
      
      int dife = Math.abs(X-Y);//差
      int min = Math.min(X,Y);//小さいほう
      int result2 = 0;
      if ( X > Y){
         result2 = C * 2 * min;
         result2 +=  Math.min(dife * A , dife * C * 2);
      }else {
         result2 = C * 2 * min ;
         result2 +=  Math.min(dife * B , dife * C * 2);
      }
      out.println(Math.min(result,result2));
   }

}