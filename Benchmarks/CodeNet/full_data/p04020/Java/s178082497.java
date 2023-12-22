import java.util.*;
 public class Main {
 
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n]; 
       for(int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
       }

       long cnt = 0;
       for(int i = 1; i < n; i++) {
          if(arr[i] == 0) continue;
          int min = Math.min(arr[i], arr[i-1]);
          cnt += min;
          arr[i-1] -= min;
          arr[i] -= min;
       }
       for(int i = 0; i < n; i++) {
          cnt += arr[i] / 2;
       }
       System.out.println(cnt);
   }
 } 