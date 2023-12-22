import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int maxk = 0;
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            int v = sc.nextInt();
            map.put(k,v);
            maxk = Math.max(maxk,k);
        }
        int[] dp = new int[h+maxk];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i < h+maxk; i++){
            for(Map.Entry<Integer,Integer> entry :map.entrySet()){
                int k = entry.getKey();
                int v = entry.getValue();
                int p = Math.max(0,i-k); //prev
                dp[i] = Math.min(dp[i], dp[p] + v);
            }
        }
        /*
        for(int i = 1; i < h+maxk; i++){
            System.out.println(i+":"+dp[i]);
        }
        */
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < maxk; i++){
            ans = Math.min(ans,dp[h+i]);
        }
        System.out.println(ans);
    }
}