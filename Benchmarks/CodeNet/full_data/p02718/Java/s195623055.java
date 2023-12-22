import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int a[] = new int[n];
      
      int sum = 0;
      
      for (int i = 0; i < n; i++) {
         int aa = sc.nextInt();
         a[i] = aa;
         sum += aa;
      }
      
      double x = sum * 100 / (4*m);
      
      int t = 0;
      
      for (int j = 0; j < n; j++) {
         int aaa = a[j];
         if (aaa*100 == x || aaa*100 > x) {
            t++;
         }
      }
      
      if (t == m || t > m) {
         System.out.println("Yes");
      } else {
         System.out.println("No");  
      }
   }        
}