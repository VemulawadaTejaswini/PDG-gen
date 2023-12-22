import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    static int dfs(int v,int pare){
        int res = 0;
        int zero=0;
        for(int u:G[v]){
            if(u==pare)continue;
            int k = dfs(u,v);
            if(k==0)++zero;
            else res+=k;
        }
        if(zero>0)--zero;
        return res+zero;
    }

    static List<Integer>[] G;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        G = new ArrayList[N];
        for(int i=0;i<N;++i)G[i] = new ArrayList<>();
        for(int i=0;i<N-1;++i){
            int a = scan.nextInt();
            int b = scan.nextInt();
            G[a].add(b);
            G[b].add(a);
        }
        int root=0;
        for(int i=0;i<N;++i){
            if(G[root].size()<G[i].size())root = i;
        }
        System.out.println(Math.max(1,dfs(root,-1)));

    }
}