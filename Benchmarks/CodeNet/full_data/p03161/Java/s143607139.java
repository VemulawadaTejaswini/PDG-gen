import java.io.*;
import java.util.*;
public class Main {

    static int solve(int[] arr, int s, int k, HashMap<Integer, Integer>  map) {
        if(s == arr.length - 1)
            return 0;
            
        if(map.containsKey(s))
            return map.get(s);
            
        int sum = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++) {
            if(s + i < arr.length) {
                sum = Math.min(sum, solve(arr, s + i, k, map) + Math.abs(arr[s] - arr[s + i]));
            }
        }
        
        map.put(s, sum);
        return sum;
    }
   public static void main(String args[]) {
       int n = 0;
       int k = 0;
       int[] arr = null;
       try (Scanner scanner = new Scanner(System.in)) {
           n = scanner.nextInt();
           k = scanner.nextInt();
           arr = new int[n];
           for (int i=0; i < n; i++) {
               arr[i] = scanner.nextInt();
           }
       }
       int ret = solve(arr, 0, k, new HashMap());
       System.out.println(ret);
   }
}
