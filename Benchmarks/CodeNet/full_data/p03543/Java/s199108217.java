import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N    = scan.nextInt();

      int[] a = new int[4];
      a[0] = N / 1000;
      for(int i = 1; i < 4; i++){
          N    = a[i] = N % (int)Math.pow(10, 4 - i);
          a[i] = a[i] / (int)Math.pow(10, 3 - i);
          }
      if((a[0] != a[1] && a[1] != a[3]) || a[1] != a[2]){
         System.out.println("No");
         }
      else{
          System.out.println("Yes");
          }
   }
}
