import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main{

    static class Edge{
        int to,cap,rev;
        Edge(int to,int cap,int rev){
            this.to=to;
            this.cap=cap;
            this.rev=rev;
        }
    }
    
    static List<Edge> G[];
    static void add_edge(int from,int to,int cap){
        G[from].add(new Edge(to,cap,G[to].size()));
        G[to].add(new Edge(from,0,G[from].size()-1));
    }

    static boolean used[]=new boolean[10000];
    static int dfs(int v,int t,int f){
        if(v==t)return f;
        used[v]=true;
        for(int i=0;i<G[v].size();++i){
            Edge e = G[v].get(i);
            if(!used[e.to]&&e.cap>0){
                int d = dfs(e.to,t,Math.min(f,e.cap));
                if(d>0){
                    e.cap-=d;
                    G[e.to].get(e.rev).cap+=d;
                    return d;
                }
            }
        }
        return 0;
    }

    static int max_flow(int s,int t){
        int flow = 0;
        while(true){
            Arrays.fill(used,false);
            int f = dfs(s,t,100000);
            if(f==0)return flow;
            flow +=f;
        }
    }

    static class Point{
        int y,x;
        Point(int y,int x){
            this.y=y;
            this.x=x;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Point[] red = new Point[N];
        Point[] blue = new Point[N];
        G = new ArrayList[2*N+2];
        for(int i=0;i<=2*N+1;++i)G[i] = new ArrayList<>();
        for(int i=0;i<N;++i){
            int a = scan.nextInt();
            int b = scan.nextInt();
            red[i] = new Point(b,a);
        }
        for(int i=0;i<N;++i){
            int c = scan.nextInt();
            int d = scan.nextInt();
            blue[i] = new Point(d,c);
        }
        for(int i=0;i<N;++i){
            for(int j=0;j<N;++j){
                if(blue[i].y>red[j].y && blue[i].x>red[j].x)add_edge(i+1, N+j+1, 1);
            }
        }
        for(int i=0;i<N;++i)add_edge(0, i+1, 1);
        for(int i=N+1;i<=2*N;++i)add_edge(i, 2*N+1, 1);
        System.out.println(max_flow(0, 2*N+1));


    }
}