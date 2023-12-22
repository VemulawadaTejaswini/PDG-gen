import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static ArrayList<Edge>[] map;
    static long[][] rec; // rec[i] = {coefficient(+-1), bias(int)};
    static long[] value;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        rec = new long[n+1][2];
        map = new ArrayList[n+1];
        value = new long[n+1];
        for(int i=0;i<n+1;i++) map[i]=new ArrayList<>();
        for(int i=0;i<m;i++){
            int u = sc.nextInt(), v = sc.nextInt(), s = sc.nextInt();
            map[u].add(new Edge(v,(long) s));
            map[v].add(new Edge(u,(long) s));
        }
        int flag = dfs(1,-1,1,0);
        long ans;
        if(flag<0) ans = 0;
        else if(flag==0){
            ans = dfs2(1,-1,value[1])?1:0;
        } else {
            long lo = 1, hi = Integer.MAX_VALUE;
            ans = hi - lo + 1;
            for (int i = 2; i <= n; i++) {
                if (rec[i][0] == 1) lo = Math.max(lo, 1 - rec[i][1]);
                else hi = Math.min(hi, rec[i][1] - 1);
                ans = Math.min(ans, hi - lo + 1);
                if (ans <= 0) break;
            }
        }
        System.out.println(Math.max(ans,0));
    }
    // dfs return -1-> contradict 1-> no contradict ;0->determined
    static int dfs(int s, int from, long co, long bias){
        if(rec[s][0]!=0) {
            if(rec[s][0]==co) return bias==rec[s][1]?1:-1;
            else{
                if(co*(rec[s][1]-bias)>=2&&co*(rec[s][1]-bias)%2==0){
                    value[1] = co*(rec[s][1]-bias)/2;
                    return 0;
                }
                else return -1;
            }
        }
        rec[s][0]=co;rec[s][1]=bias;
        for(Edge e:map[s]){
            if(e.to==from) continue;
            int flag = dfs(e.to,s,co*(-1),e.weight-bias);
            if(flag<=0) return flag;

        }
        return 1;
    }
    static boolean dfs2(int s, int from, long val){
        if(val<1) return false;
        if(value[s]!=0) return val==value[s];
        value[s]=val;
        for(Edge e:map[s]){
            if(e.to==from) continue;
            boolean flag = dfs2(e.to,s,e.weight-val);
            if(!flag) return false;
        }
        return true;
    }
    static class Edge{
        int to;
        long weight;
        public Edge(int t, long w){
            this.to = t; this.weight=w;
        }
    }
}
