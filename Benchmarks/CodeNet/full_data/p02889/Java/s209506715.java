import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        int L = Integer.parseInt(sc.next());
        long[][] edge = new long[V][V];
        long INF = 200_000_000_000_000L;
        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                if (i==j) {
                    continue;
                }
                edge[i][j] = INF;
            }
        }
        for (int i=0;i<E;i++) {
            int s = Integer.parseInt(sc.next())-1;
            int t = Integer.parseInt(sc.next())-1;
            long d = Long.parseLong(sc.next());
            edge[s][t] = d;
            edge[t][s] = d;
        }
        for (int k=0;k<V;k++) {
            for (int i=0;i<V;i++) {
                for (int j=0;j<V;j++) {
                    if(edge[i][k] != INF && edge[k][j] != INF) {
                          if (edge[i][j]>edge[i][k]+edge[k][j]) {
                              edge[i][j] = edge[i][k]+edge[k][j];
                          }
                    }
                }
            }
        }
        // System.out.println("len: " + Arrays.deepToString(edge));
        // long[][] edge_2 = new long[V][V];
        // for (int i=0;i<V;i++) {
        //     for (int j=0;j<V;j++) {
        //         edge_2[i][j] = edge[i][j];
        //     }
        // }
        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                if (i==j) {
                    continue;
                }
                if (edge[i][j]<=L) {
                    edge[i][j]=1;
                } else {
                    edge[i][j]=INF;
                }
            }
        }
        // System.out.println("cnt: " + Arrays.deepToString(edge));
        for (int k=0;k<V;k++) {
            for (int i=0;i<V;i++) {
                for (int j=0;j<V;j++) {
                    if(edge[i][k] != INF && edge[k][j] != INF) {
                          if (edge[i][j]>edge[i][k]+edge[k][j]) {
                              edge[i][j] = edge[i][k]+edge[k][j];
                          }
                    }
                }
            }
        }
        // for (int i=0;i<V;i++) {
        //     for (int j=0;j<V;j++) {
        //         if (edge_2[i][j]<=L) {
        //             edge[i][j]=0;
        //         }
        //     }
        // }
        // System.out.println(Arrays.deepToString(edge_2));
        // int flag = 0;
        // for (int i=0;i<V;i++) {
        //     if (edge[i][i]!=0) {
        //         System.out.println("NEGATIVE CYCLE");
        //         flag=1;
        //         break;
        //     }
        // }
        // if (flag==0) {
        //     for (int i=0;i<V;i++) {
        //         for (int j=0;j<V;j++) {
        //             if (edge[i][j]==INF) {
        //                 System.out.print("INF");
        //             } else {
        //                 System.out.print(edge[i][j]);
        //             }
        //             if (j==V-1) {
        //                 System.out.println("");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        // }
        int Q = Integer.parseInt(sc.next());
        for (int i=0;i<Q;i++) {
            int s = Integer.parseInt(sc.next())-1;
            int t = Integer.parseInt(sc.next())-1;
            if (edge[s][t]==INF) {
                System.out.println(-1);
            } else {
                System.out.println(edge[s][t]-1);
            }
        }
        // System.out.println(Arrays.deepToString(edge));
    }
}