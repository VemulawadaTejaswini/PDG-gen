import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int m = sc.nextInt();
      
      int aa[] = new int[a];
      int ab[] = new int[b];
      
      for (int i = 0; i < a; i++) {
         aa[i] = sc.nextInt();
      }
      
      for (int j = 0; j < b; j++) {
         ab[j] = sc.nextInt();
      }
      
      int min = 1000000;
      
      for (int k = 0; k < a; k++) {
         for (int l = 0; l < b; l++) {
            if (aa[k] + ab[l] < min) {
               min = aa[k] + ab[l];
            }
         }   
      }
      
      for (int n = 0; n < m*3; n+=3) {   
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int xm = sc.nextInt();
            
            int aaa = aa[xa-1];
            int bbb = ab[xb-1];
            
            if (min > (aaa + bbb - xm)) {
               min = (aaa + bbb - xm);
            }
      }
      
      System.out.println(min);
               
   }        
}
