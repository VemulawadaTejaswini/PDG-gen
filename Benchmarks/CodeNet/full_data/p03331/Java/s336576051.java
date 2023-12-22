import java.util.*;

import sun.font.TrueTypeFont;

import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      int N = sc.nextInt();
      int sum = 0;
      while(N > 0) {
        sum += N % 10;
        N /= 10;
      }
      if (sum == 1){
        sum*= 10;
      }
      out.println(sum);
   }
}