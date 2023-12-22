import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      long aa = (long)Math.sqrt(a);
        if(aa*aa> a) {
            aa--;
        }
      long bb = (long)Math.sqrt(a);
        if(bb*bb > b) {
            bb--;
        }
        
      long cc = (long)Math.sqrt(a);
        if(cc*cc > c) {
            cc--;
        }
      
      
      if (aa + bb < cc) {
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }      
   }        
}