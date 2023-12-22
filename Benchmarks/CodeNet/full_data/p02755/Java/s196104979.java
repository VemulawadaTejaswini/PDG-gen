import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
               
      int a = sc.nextInt(); 
      int b = sc.nextInt(); 
            
      int count = 0;
      
      if (a == 0) {
         if (b == 0) {
            System.out.println("1");
            count = 1;
         } else if (b == 1) {
            System.out.println("10");
            count = 1;
         } else {
            System.out.println("-1");
            count = 1;
         }
      }
      
      if (b == 0) {
         if (a == 0) {
            System.out.println("1");
            count = 1;
         } else {
            System.out.println("-1");
            count = 1;
         }
      }
      
      for (int i = 0; i < 1000; i++) {
         for (int j = 0; j < 1000; j++) {
            if (count != 0) {
               break;
            }
            int aa = (a * 1000 + i) / 80;
            int bb = (b * 1000 + j) / 100;
               
            if (aa == bb) {
               System.out.println(aa);
               count = 1;
            }
         }   
      }
      
      if (count == 0) {
         System.out.println("-1");
      }
   }        
}
