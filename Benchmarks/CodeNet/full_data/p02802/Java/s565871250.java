import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] p = new int[m];
      String[] s = new String[m];
      for (int i = 0; i < p.length; i++) {
         p[i] = sc.nextInt();
         s[i] = sc.next();
      }

      int w = 0;
      int a = 0;

      for (int j = 1; j <= n; j++) {
         int c = 0;
         int count = 0;
         for (int i = 0; i < m; i++) {
            if (p[i] == j) {
               count = count + 1;
               if("AC".equals(s[i])){
                  a = a + 1;
                  break;
               }
               else{
                  c = c + 1;
               }
            }
         }
         if(c < count){
            w = w + c;
         }
      }

      System.out.print(w);
      System.out.print(' ');
      System.out.println(a);
   }
}