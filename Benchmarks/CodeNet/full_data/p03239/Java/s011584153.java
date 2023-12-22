import java.util.*;

public class Main {
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int t = sc.nextInt();
     int[] cArray = new int[n];
     int[] tArray = new int[n];
     
     int minCost = 1001;
     
     for (int i = 0; i < n; i++) {
       cArray[i] = sc.nextInt();
       tArray[i] = sc.nextInt();
       if(tArray[i] <= t) {
           minCost = Math.min(cArray[i], minCost);
       }
     }
     
     if(minCost == 1001) {
         System.out.println("TLE");
     } else {
         System.out.println(minCost);
     }
   }
}