import java.util.*;

class Main {
    static ArrayList<Long>[] g;
    static long[] d;
    static void dfs(int v,long u,int p){
        d[v]=u;
        for(long we:g[v]){
            int w=(int)(we>>>32);
            long e=(int)we;
            if(w==p)continue;
            dfs(w,u+e,v);
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        g=new ArrayList[n];
        for(int i=0;i<n;++i)g[i]=new ArrayList<Long>();
        for(int i=0;i<n-1;++i){
            int a=scan.nextInt()-1;
            int b=scan.nextInt()-1;
            long c=scan.nextInt();
            g[a].add((long) b << 32 | c);
            g[b].add((long) a << 32 | c);
        }
        int q=scan.nextInt(),k=scan.nextInt()-1;
        d=new long[n];
        dfs(k,0,-1);
        while(q-->0){
            int x=scan.nextInt()-1;
            int y=scan.nextInt()-1;
            System.out.println(d[x]+d[y]);
        }
    }
}
