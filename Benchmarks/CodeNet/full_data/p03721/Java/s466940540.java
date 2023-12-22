import java.util.*;

public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      long[] box = new long[100000];
      for (int i = 0; i < n; i++) {
         int a  = sc.nextInt();
         int b = sc.nextInt();
         box[a] += b;
      }
      
      for(int i = 0; i < 100000; i++) {
             k -= box[i];
             if(k <= 0) {
                   System.out.println(i);
                   return;
             }
      }
  }
}