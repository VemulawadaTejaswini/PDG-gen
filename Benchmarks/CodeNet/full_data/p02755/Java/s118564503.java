import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
               
      int a = sc.nextInt(); //8
      int b = sc.nextInt(); //10
      
 //     int aa = a * 100 / 8; // 100
 //     int bb = b * 100 / 10; //100
      
      int count = 0;
      
      for (int i = 0; i < 100; i++) {
         for (int j = 0; j < 100; j++) {
            if (count != 0) {
               break;
            }
            int aa = (a * 100 + i) / 8;
            int bb = (b * 100 + j) / 10;
               
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