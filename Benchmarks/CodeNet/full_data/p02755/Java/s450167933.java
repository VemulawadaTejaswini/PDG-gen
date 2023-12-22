import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
               
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int aa = a * 100 / 8; // 100
      int bb = b * 100 / 10; //100
      
      if (aa == bb) {
         System.out.println(aa);
      } else {
      
         int ima = aa * 8 / 100; // 8
         
         if (ima == b) {      
            System.out.println(aa);
         } else {
         
            int bbb = b * 100 / 10; // 100
            
            int imag = bbb * 10 / 100; //10
            
            if (imag == a) {
               System.out.println(bbb);   
            } else {
               System.out.println("-1");
            }
         }
      }
   }        
}