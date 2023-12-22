import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{

    static class Edge{
        int to;
        long cost;
        Edge(int to,long cost){
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int S = scan.nextInt();
        int T = scan.nextInt();
        long mod = (long)1e9+7;

        List<Edge>[] edge = new ArrayList[N+1];
        for(int i=1;i<=N;++i)edge[i]=new ArrayList<>();

        for(int i=0;i<M;++i){
            int u=Integer.parseInt(scan.next());
            int v=Integer.parseInt(scan.next());
            long d=Long.parseLong(scan.next());
            edge[u].add(new Edge(v,d));
            edge[v].add(new Edge(u,d));
        }

        class pqNum{
            int v;
            long dis;
            pqNum(int v,long d){
                this.v=v;
                dis=d;
            }
        }
        long disS[] = new long[N+1];
        long disT[] = new long[N+1];
        Arrays.fill(disS,Long.MAX_VALUE/2);
        Arrays.fill(disT,Long.MAX_VALUE/2);

        PriorityQueue<pqNum> que = new PriorityQueue<>((a,b) -> a.dis < b.dis ? -1:1);
        disS[S]=0;
        que.add(new pqNum(S, 0));
        while(!que.isEmpty()){
            pqNum pq = que.poll();
            int v = pq.v;
            if(disS[v]<pq.dis)continue;
            for(Edge u : edge[v]){
                if(disS[u.to] > disS[v]+u.cost){
                    disS[u.to]=disS[v]+u.cost;
                    que.add(new pqNum(u.to, disS[u.to]));
                }
            }
        }
        disT[T]=0;
        que.add(new pqNum(T, 0));
        while(!que.isEmpty()){
            pqNum pq = que.poll();
            int v = pq.v;
            if(disT[v]<pq.dis)continue;
            for(Edge u : edge[v]){
                if(disT[u.to] > disT[v]+u.cost){
                    disT[u.to]=disT[v]+u.cost;
                    que.add(new pqNum(u.to, disT[u.to]));
                }
            }
        }


        long dpS[] = new long[N+1];
        long dpT[] = new long[N+1];
        boolean used[] = new boolean[N+1];

        dpS[S]=1;

        que.add(new pqNum(S, 0));
        while(!que.isEmpty()){
            pqNum pq = que.poll();
            int v = pq.v;
            used[v]=true;
            for(Edge u : edge[v]){
                if(disS[u.to] == disS[v]+u.cost){
                    dpS[u.to] = (dpS[u.to]+dpS[v])%mod;
                    if(!used[u.to])que.add(new pqNum(u.to, disS[u.to]));
                }
            }
        }
        Arrays.fill(used,false);
        dpT[T]=1;
        que.add(new pqNum(T, 0));
        while(!que.isEmpty()){
            pqNum pq = que.poll();
            int v = pq.v;
            used[v]=true;
            if(disT[v]<pq.dis)continue;
            for(Edge u : edge[v]){
                if(disT[u.to] == disT[v]+u.cost){
                    dpT[u.to] =(dpT[u.to]+ dpT[v])%mod;
                    if(!used[u.to])que.add(new pqNum(u.to, disT[u.to]));
                }
            }
        }


        class LR{
            int L,R;
            long num;
            LR(int l,int r,long n){
                L=l;
                R=r;
                num = n;
            }
        }
        List<LR> lrList = new ArrayList<>();

        List<Integer> V = new ArrayList<>();


        // if(disS[T]%2==0){
        //     for(int i=1;i<=N;++i){
        //         if(disS[i]==disS[T]/2)V.add(i);
        //     }
        //     for(int i=1;i<=N;++i){
        //         if(disS[i]<disS[T]/2){
        //             for(Edge e : edge[i]){
        //                 if(disT[e.to]<disS[T]/2){
        //                     lrList.add(new LR(i, e.to,(dpS[i]*dpT[e.to])%mod));
        //                 }
        //             }
        //         }
        //     }
        // }else{
        //     for(int i=1;i<=N;++i){
        //         if(disS[i]<=disS[T]/2){
        //             for(Edge u:edge[i]){
        //                 if(disT[u.to]<=disS[T]/2)lrList.add(new LR(i,u.to,(dpS[i]*dpT[u.to])%mod));
        //             }
        //         }
        //     }
        // }


        long ans = 0;
        long sum = 0;
        for(LR lr : lrList){
            sum = (sum + lr.num)%mod;
        }
        for(int v : V){
            sum = (sum + (dpS[v]*dpT[v])%mod)%mod;
        }



        for(LR lr : lrList){
            ans = (ans + (lr.num * ((sum - lr.num +mod)%mod))%mod)%mod;
        }
        for(int v : V){
            ans = (ans + (((dpS[v]*dpT[v])%mod) * ((sum - (dpS[v]*dpT[v])%mod + mod)%mod))%mod)%mod;
        }
        System.out.println(ans);






    }
}