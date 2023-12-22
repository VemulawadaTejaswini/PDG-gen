import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main{

    static boolean isWhite[];
    static List<Integer> edges[];
    static boolean[] used;
    static boolean[] haveWhite;

    static long dfs(int v,int d){
        long res=0;
        used[v]=true;
        if(isWhite[v])res = (long)d*1000000000 + v;
        for(int u : edges[v])if(!used[u])res=Math.max(res, dfs(u, d+1));
        haveWhite[v]=res>0;
        return res;
    }

    static int cnt=1;//sのマス

    static boolean dfs2(int v, int t){
        used[v]=true;
        boolean res=v==t;
        for(int u : edges[v])if(!used[u]&&haveWhite[u]){
            ++cnt;
            if(dfs2(u, t)){
                res=true;
                if(!isWhite[u])++cnt;
            }
            else{
                ++cnt;
                if(isWhite[u])++cnt;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        edges = new ArrayList[N];
        isWhite = new boolean[N];
        used = new boolean[N];
        haveWhite = new boolean[N];
        for(int i=0;i<N;++i)edges[i]=new ArrayList<>();
        for(int i=0;i<N-1;++i){
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            edges[x].add(y);
            edges[y].add(x);
        }
        String S = scan.next();
        for(int i=0;i<N;++i)isWhite[i]=S.charAt(i)=='W';
        Arrays.fill(used, false);
        int s = (int)(dfs(0,1)%1000000000);
        Arrays.fill(used ,false);
        int t = (int)(dfs(s,1)%1000000000);
        Arrays.fill(used, false);
        dfs2(s, t);
        if(s==t&&!isWhite[s])cnt=0;
        System.out.println(cnt);
    }
}