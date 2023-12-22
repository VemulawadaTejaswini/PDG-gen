import java.io.*;
import java.util.*;
public class Main {
    static int solve(int[] arr, int s, HashMap<Integer, Integer> map) {
        if(s >= arr.length - 1)
            return 0;
        if(map.containsKey(s))
            return map.get(s);
        
        int msum = Integer.MAX_VALUE;
        int i = s + 1;
        if(i < arr.length)
            msum = Math.min(msum, solve(arr, i, map) + Math.abs(arr[s] - arr[i]));
        i++;
        if(i < arr.length)
            msum = Math.min(msum, solve(arr, i, map) + Math.abs(arr[s] - arr[i]));
        
        map.put(s, msum);
        return msum;
    }
    public static void main(String args[]) {
        int n = 0;
        int[] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            arr = new int[n];
            for (int i=0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }
        // System.out.println(Arrays.toString(arr));
        HashMap<Integer, Integer> map = new HashMap();
        int ret = solve(arr, 0, map);
        // System.out.println(map);
        System.out.println(ret);
    }
}