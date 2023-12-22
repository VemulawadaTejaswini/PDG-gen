import java.util.*;

public class Main {
 public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   char[] nChar = String.valueOf(n).toCharArray();
   int sn = 0;
   for (int i = 0; i < nChar.length; i++) {
          sn += Integer.parseInt(String.valueOf(nChar[i]));
   }
   if(n % sn == 0) {
      System.out.println("Yes");
      return;
   } 
   System.out.println("No");
 }
}