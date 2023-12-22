import java.util.*;

public class Main {
 public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   char[] n = String.valueOf(n).toCharArray();
   int sn = 0;
   for (int i = 0; i < n.length; i++) {
     sn += Integer.parseInt(char[i]);
   }
   if(n % sn == 0) {
      System.out.println("Yes");
      return;
   } 
   System.out.println("No");
 }
}