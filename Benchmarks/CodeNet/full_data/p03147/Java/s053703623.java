import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int[] h = new int[a];
      for(int i = 0; i < a; i++) {
         h[i] = sc.nextInt();
      }
      System.out.println(answer(h, a));
   }
   
   public static int answer(int[] h, int minIndex) {
      if(minIndex == 0)
         return 0;
      if(minIndex == 1)
         return h[0];
      int min = 100000;
      int ind = 0;
      for(int i = 0; i < minIndex; i++) {
         if(min > h[i]) {
            min = h[i];
            ind = i;
         }
      }
      int[] a = new int[ind];
      for(int i = 0; i < ind; i++) {
         a[i] = h[i] - min;
      }
      int[] b = new int[minIndex - ind - 1];
      for(int i = ind + 1; i < minIndex; i++) {
         b[i - ind - 1] = h[i] - min;
      } 
      return answer(a, ind) + answer(b, minIndex - ind - 1) + min;
   }
}