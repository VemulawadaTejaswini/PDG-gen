/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{

    static int n;
    static long[] times;
    static int m;
    static long ans;
    static int[] rate;
    static int var;
    static int ansmin;
    static int ansmax;
    static int[] w;
    static int[] ww;
    static boolean[] visit;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        times = new long[n];
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans = times[i];
            }else{
                ans = times[i]/gcd(times[i], times[i-1])*times[i-1];
            }
        }
        System.out.println(ans);

        sc.close();
    }

    public static long gcd(long a, long b) {
        
        if (a < b) {
            long tmpp = a;
            a = b;
            b = tmpp;
        }
        if (a % b == 0) {
            return b;
        }else{
            return gcd(b, a%b);
        }
    }

    public static void dfs(int placenow) {
        // if went all -> success! 
        // if not went all -> fail...
        
        /*
         dfs
         Go All Place that there is way to and not having been yet. 

         if island 1 is start point, dfs(1);
         if there is way to island 2 and island 3,
         - island 2 changes non-visited -> visited, and dfs(2).
         - island 3 changes non-visited -> visited, and dfs(3).
         

        */

        visit[placenow] = true;
        boolean success = true;
        for (int i = 0; i < n; i++) {
            if (visit[i] == false) { // not go all place
                success = false;
                break;
            }
        }
        if (success) {
            ans++;
            visit[placenow] = false;
            return;
        }

        for (int i = 0; i < m; i++) {
            if (w[i] == placenow && visit[ww[i]] == false ) {
                dfs(ww[i]);
            }else if(ww[i] == placenow && visit[w[i]] == false){
                dfs(w[i]);
            }else{
                continue;
            }
        }
        visit[placenow] = false;
        return;
    }

}

