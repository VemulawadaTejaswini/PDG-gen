

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private static Scanner in;

    private static int n;
    private static HashMap<Integer, ArrayList<Integer>> g;

    private static final int MOD = (int)1e9+7;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        g = new HashMap<>();
        for(int i=0; i<n; i++) {
            g.put(i, new ArrayList<>());
        }

        for(int i=0; i<n-1; i++) {
            int p = in.nextInt()-1;
            int q = in.nextInt()-1;
            g.get(p).add(q);
            g.get(q).add(p);
        }


        long ans = (dfs(0, 0, -1)+dfs(0, 1, -1))%MOD;

        System.out.println(ans);

    } 

    private static long dfs(int u, int c, int p) {
        //u is current node
        //c is parent p's color

        long ans = 1;

        for(int v: g.get(u)) {
            if (v==p) continue;

            if (c==0) {
                ans = (ans*(dfs(v, 1, u)+dfs(v, 0, u)))%MOD;
            } else {
                ans = (ans*dfs(v, 0, u))%MOD;
            }
        }

        return ans;
    }

}
