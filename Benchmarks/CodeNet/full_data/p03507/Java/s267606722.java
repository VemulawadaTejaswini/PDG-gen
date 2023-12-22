/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;



public class Main{

        static int MOD = (int)1e9+7;
        
        // for dfs
        static int n;
        static int ansi;
        static int[] w;
        static int[] ww;
        static boolean[] isvisited;
        //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] w = new long[n];
        long[] d = new long[n];
        long low = 0;
        long high = (long)(2e18+1);
        long answer = (low + high)/2;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextLong();
            d[i] = sc.nextLong();
        }
        

        // nibutan 
        while (high -low >1) {
            answer = (low + high)/2;
            if (FlowerNum(answer,w,d,n) >= k) {
                high = answer;
            }else {
                low = answer;
            }
        }

        System.out.println(high);

        sc.close();
    }

    public static long FlowerNum(long x,long[] w, long[] d, int n) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (x >= w[i]) {
                ans += (1 + (x-w[i])/d[i]);
            }
        }
        return ans;
    }


       
        
        public static int ManhattanDist(int x, int y, int xx, int yy) {
            return(Math.abs(xx-x) + Math.abs(yy-y));
        }

            public static void dfs(int placep) {
                // if went all -> success! 
                // if not went all -> fail...
            
                /*
                dfs    
                Go All Place that there is wayto to and not having been yet. 

                if island 1 is start point, dfs(1);
                if there is wayto to island 2 and island 3,
                - island 2 changes non-visited -> visited, and dfs(2).
                - island 3 changes non-visited -> visited, and dfs(3).
    
                */

                isvisited[placep] = true;
                boolean success = true;
                for (int i = 0; i < n; i++) {
                    if (isvisited[i] == false) { // not go all place
                        success = false;
                        break;
                    }
                }
                if (success) {
                    ansi++;
                    isvisited[placep] = false;
                    return;
                }

                for (int i = 0; i < n; i++) {
                    if (w[i] == placep && isvisited[ww[i]] == false ) {
                        dfs(ww[i]);
                    }else if(ww[i] == placep && isvisited[w[i]] == false){
                        dfs(w[i]);
                    }else{
                        continue;
                    }
                }
                isvisited[placep] = false;
                return;
            }
}


class Algorithm{

    public static int gcd_int(int a, int b) {
        if (b == 0) {
            return a;
        }else{
            return gcd_int(b, a%b);
        }
    } 

    public static long gcd_long(long a, long b) {
    
        if (a < b) {
            long x = a;
            a = b;
            b = x;
        }
        if (b == 0) {
            return a;
        }else{
            return gcd_long(b, a%b);
        }
    }

    public static int lcm_int(int a, int b) {
        int gcd = gcd_int(a,b);
        return a/gcd*b;
    }

    public static long lcm_long(long a, long b) {
        long gcd = gcd_long(a,b);
        return a/gcd*b;
    }

    public static long Diameter_of_Tree(int Vertex_Num, int Edge_Num, int[] Vertex_1, int[] Vertex_2, long[] Edge_Length){
        /** Double Sweep
         *  1. Search farthest Vertex(x) from one Vertex(vertex_0).
         *      -> use DFS <by using Deque>
         *  2. From Vertex x, search farthest vertex(y).
         *  3. Path from x to y is the diameter of the tree.
         */
        int point_x,point_y;
        long diameter=0;
        
        if (Vertex_Num == 1) {}
        else{
            
        }
        return diameter;
    }

    public static void DFS_Farthest_Vertex(int startVertex, int Vertex_Num, int Edge_Num,
                                                    int[] Vertex_1, int[] Vertex_2, long[] Edge_Length){
        /**
         * Ka - Ki - Ka - Ke
         */
    }


}
