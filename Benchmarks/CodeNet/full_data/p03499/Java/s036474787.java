import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



class Main{

    static class Pair{
        long p1,p2;
        Pair(long p1,long p2){this.p1=p1;this.p2=p2;}
    }
    static class Edge{
        int to;
        Edge(int to){this.to=to;}
    }
    static List<Integer> edges[];
    static Edge edge[];
    static long base;
    static long invtwo[];
    static int n;
    static long mod = (long)1e9+7;

    static Map<Integer, Pair> dfs(int v, int depth){
        long p1 = base;
        long p2 = base;
        Map<Integer, Pair> res;
        if(edges[v].size()==0){
            res = new HashMap<>();
        }else{
            res = dfs(edges[v].get(0), depth+1);
            Map<Integer, Long> pp = new HashMap<>();
            for(int i=1;i<edges[v].size();++i){
                Map<Integer, Pair> map2 = dfs(edges[v].get(i), depth+1);
                if(map2.size()>res.size()){
                    Map<Integer, Pair> tmp = res;
                    res =map2;map2=tmp;
                }
                for(Map.Entry<Integer, Pair> entry : map2.entrySet()){
                    if(!pp.containsKey(entry.getKey()))pp.put(entry.getKey(), 0L);
                    if(res.containsKey(entry.getKey())){
                        Pair pi = res.get(entry.getKey());
                        Pair pj = entry.getValue();
                        long p = ((((pi.p1*pj.p2)%mod + (pi.p2*pj.p1)%mod)%mod) *invtwo[n+1])%mod;
                        pp.put(entry.getKey(), (pp.get(entry.getKey()) + (((pi.p2*pj.p2)%mod)*invtwo[n+1]%mod)%mod)%mod);
                        pi.p1 = ((pi.p1*pj.p1)%mod*invtwo[n+1])%mod;
                        pi.p2 = p;
                    }else{
                        res.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            for(Map.Entry<Integer, Pair> entry : res.entrySet()){
                if(!pp.containsKey(entry.getKey()))continue;
                entry.getValue().p1 = (entry.getValue().p1 + pp.get(entry.getKey()))%mod;
            }
        }
        res.put(depth, new Pair(p1,p2));
        return res;
    }

    static long inverse(long m, long mod){
        long res =1;
        for(int i=0;i<32;++i){
            if((((mod-2)>>i)&1)==1)res=(res*m)%mod;
            m=(m*m)%mod;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        edges = new ArrayList[n+1];
        edge = new Edge[n+1];
        for(int i=0;i<n+1;++i)edges[i]=new ArrayList<>();
        for(int i=0;i<n;++i)edges[scan.nextInt()].add(i+1);
        long ans = 0;
        invtwo = new long[n+2];
        invtwo[0]=1;
        for(int i=1;i<=n+1;++i)invtwo[i]=(invtwo[i-1]*2)%mod;
        base = 1;
        for(int i=0;i<n;++i)base=(2*base)%mod;
        for(int i=0;i<=n+1;++i)invtwo[i]=inverse(invtwo[i], mod);

        Map<Integer, Pair> mp = dfs(0, 0);
        for(Map.Entry<Integer, Pair> entry : mp.entrySet()){
            ans = (ans + entry.getValue().p2)%mod;
        }
        System.out.println(ans);
    }
}