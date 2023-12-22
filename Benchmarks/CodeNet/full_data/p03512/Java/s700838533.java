import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.*;

import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;


class QueDto implements Comparable<QueDto>{
    int v,dis;
    public QueDto(int v,int dis){
        this.v = v;
        this.dis = dis;
    }

    @Override
    public int compareTo(QueDto q){
        return this.dis - q.dis;
    }
}

// class Edge{
//     int from,to,cap,cost,rindex;
//     public Edge(int from,int to,int cap,int cost,int rindex){
//         this.from = from;
//         this.to = to;
//         this.cap = cap;
//         this.cost = cost;
//         this.rindex = rindex;
//     }
// }

class Edge{
    int to,cap,rindex;
    public Edge(int to,int cap,int rindex){
        this.to = to;
        this.cap = cap;
        this.rindex = rindex;
    }
}

// class MinCostFlow{

//     private int N;
//     List<Edge>[] G;

//     public MinCostFlow(int N){
//         this.N = N;
//         G = new ArrayList[N];
//         for(int i=0;i<N;++i){
//             G[i] = new ArrayList<>();
//         }
//     }

//     public void setEdge(int from,int to,int cap,int cost){
//         G[from].add(new Edge(from,to,cap,cost,G[to].size()));
//         G[to].add(new Edge(to,from,0,-cost,G[from].size()-1));
//     }

//     public int getMinCostFlow(int s,int t,int f){
//         int[] dis = new int[N];
//         int[] h = new int[N];
//         Edge[] prevE = new Edge[N];
//         Arrays.fill(h,0);
//         int res = 0;
//         while(f>0){
//             Arrays.fill(dis,Integer.MAX_VALUE);
//             dis[s]=0;
//             PriorityQueue<QueDto> que = new PriorityQueue<>();
//             que.add(new QueDto(s,0));
//             while(!que.isEmpty()){
//                 QueDto q = que.poll();
//                 if(dis[q.v] < q.dis)continue;
//                 G[q.v].stream()
//                         .filter(e -> e.cap>0)
//                         .filter(e -> dis[e.to] < dis[q.v] + e.cost + h[q.v] - h[e.to])
//                         .forEach(e -> {
//                             dis[e.to] = dis[q.v] + e.cost + h[q.v] - h[e.to];
//                             que.add(new QueDto(e.to, dis[e.to]));
//                             prevE[e.to] = e;
//                         });
//             }
//             if(dis[t] == Integer.MAX_VALUE)return -1;
//             for(int i=0;i<N;++i)h[i] = dis[i];
//             int d = f;
//             for(int v = t;v!=s; v = prevE[v].from){
//                 d = Math.min(d,prevE[v].cap);
//             }
//             res += d*dis[t];
//             f -= d;

//             for(int v=t;v!=s;v=prevE[v].from){
//                 prevE[v].cap -= d;
//                 G[v].get(prevE[v].rindex).cap += d;
//             }
//         }

//         return res;
//     }
// }

class MaxFlow{

    private int N;
    private List<Edge>[] G;
    private int[] bfsLevel;
    private int[] dfsItr;


    public MaxFlow(int N){
        this.N = N;
        G = new ArrayList[N];
        bfsLevel = new int[N];
        dfsItr = new int[N];
        for(int i=0;i<N;++i){
            G[i] = new ArrayList<>();
        }
    }

    public void setEdge(int from,int to,int cap){
        G[from].add(new Edge(to,cap,G[to].size()));
        G[to].add(new Edge(from,0,G[from].size()-1));
    }

    private boolean bfs(int s, int t){
        Arrays.fill(bfsLevel, -1);
        bfsLevel[s] = 0;
        Deque<Integer> que = new ArrayDeque<>();
        que.add(s);
        while(! que.isEmpty()){
            int v = que.poll();
            G[v].stream()
                .filter(e -> bfsLevel[e.to]<0)
                .filter(e -> e.cap > 0)
                .forEach(e ->{
                    bfsLevel[e.to] = bfsLevel[v] + 1;
                    que.add(e.to);
                });
        }
        return bfsLevel[t] >= 0;
    }

    private int dfs(int s, int t, int f){
        if(s == t)return f;
        while(dfsItr[s] < G[s].size()){
            Edge e = G[s].get(dfsItr[s]);
            if(bfsLevel[e.to] > bfsLevel[s] && e.cap >0){
            int d = dfs(e.to, t, Math.min(f,e.cap));
            if(d > 0){
                e.cap -= d;
                G[e.to].get(e.rindex).cap +=d;
                return d;
            }
            }
            ++dfsItr[s];
        }
        return 0;
    }

    public int getMaxFlow(int s,int t){
        int res = 0;
        while(true){
            if(!bfs(s,t))break;
            int d = 1;
            Arrays.fill(dfsItr,0);
            while(d > 0){
                d = dfs(s,t,Integer.MAX_VALUE/2);
                res += d;
            }
        }

        return res;
    }
}

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        MaxFlow flow = new MaxFlow(301);
        int ans = 0;
        while(Q-- > 0){
            int m = scan.nextInt();
            int x = scan.nextInt();
            if(x>0){
                ans += x;
                flow.setEdge(0, m, x);
                flow.setEdge(m, 1, 0);
            }else{
                flow.setEdge(0, m, 0);
                flow.setEdge(m, 1, -x);
            }
        }

        for(int m=2;m<=300;++m){
            for(int k=2;k<m;++k){
                if(m%k == 0){
                    flow.setEdge(m, k, Integer.MAX_VALUE/2);
                }
            }
        }

        System.out.println(ans - flow.getMaxFlow(0, 1));


    }
}