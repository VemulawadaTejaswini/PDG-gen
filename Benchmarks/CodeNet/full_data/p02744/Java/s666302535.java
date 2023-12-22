import java.util.*;
public class Main  {
   public static void main(String[] args)  throws java.lang.Exception {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      String a = "abcdefghijklmnopqrstuvwxyz";
            
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(a.charAt(j));
         }
         System.out.println();
      }
      
   }        
}
