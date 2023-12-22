import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     n     = scan.nextInt();
      int     day   = scan.nextInt();
      int     rest  = scan.nextInt();
      int     count = n + rest;

      int[] shohi = new int[n];
      for(int i = 0; i < n; i++){
          shohi[i] = scan.nextInt();
          count   += (day - 1) / shohi[i];
          }

      System.out.println(count);
   }
}
