import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      String S = sc.next();
      char[] s = new char[n];
      for (int i = 0; i < s.length; i++) {
         s[i] = S.charAt(i);
      }

      int sum = 0;

      for (int j = 0; j < n; j++) {
         for (int i = j + 1; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
               if (i - j != k - i && s[i] != s[j] && s[j] != s[k] && s[k] != s[i]) {
                  sum = sum + 1;
               }
            }
         }
      }

      System.out.println(sum);

   }

}