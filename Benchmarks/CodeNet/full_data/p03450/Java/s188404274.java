import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Pair>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            int d = sc.nextInt();
            g[l].add(new Pair(r, d));
            g[r].add(new Pair(l, -d));
        }
        int[] p = new int[n];
        boolean[] used = new boolean[n];
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            if(used[i]) continue;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(i);
            used[i] = true;
            while(!q.isEmpty()){
                int v = q.poll();
                used[v] = true;
                for(Pair na : g[v]){
                    int nv = na.x, nd = na.y;
                    if(used[nv]){
                        if(p[nv] != p[v] + nd){
                            ans = false;
                            break;
                        }
                    }else{
                        p[nv] = p[v] + nd;
                        q.add(nv);
                    }
                }
                if(!ans)break;
            }
            if(!ans)break;
        }
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

    static class Pair{
        final int x;
        final int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
