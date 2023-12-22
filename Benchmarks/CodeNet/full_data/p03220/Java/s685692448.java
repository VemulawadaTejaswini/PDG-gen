import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      
      int T = sc.nextInt();
      int A = sc.nextInt();
      
      int index = 1;
      double diff = 10000000000.0;
      for(int i = 0; i < N; i++) {
         int H = sc.nextInt();
         
         double d = Math.abs(A - (T - H * .006));
         if(d < diff) {
            diff = d;
            index = i+1;
         }
      }
      System.out.println(index);
   }
}