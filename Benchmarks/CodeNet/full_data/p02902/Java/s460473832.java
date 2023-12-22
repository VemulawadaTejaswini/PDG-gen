import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        g = new ArrayList[n];

        for (int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }

        for (int i=0; i<m; i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            g[u].add(v);
        }

        prev = new int[n][n];
        dist = new int[n][n];
        int ucycle = -1; int dmin = n+1;

        for (int i=0; i<n; i++){
            Arrays.fill(prev[i], -1);
            Arrays.fill(dist[i], -1);
            int d = bfs(i);
            if (0 < d && d < dmin){
                ucycle = i;
                dmin = d;
//                break;
            }
        }
        if (ucycle==-1){
            System.out.println(-1);
        }
        else{
            StringBuilder sb = new StringBuilder();
            sb.append(dmin+"\n");
            ArrayList<Integer> list = new ArrayList<>();
            int i = prev[ucycle][ucycle];
            while (i!=ucycle){
                list.add(i);
                i = prev[ucycle][i];
            }
            list.add(ucycle);
//            Collections.reverse(list);
            for (int v: list){
                sb.append((v+1)+"\n");
            }
            System.out.println(sb.toString());
        }



    }

    static ArrayList<Integer>[] g;
    static int[][] prev;
    static int[][] dist;

    static int bfs(int i){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(i);
        dist[i][i] = 0;
        while (!list.isEmpty()){
            int u = list.poll();
            for (int v: g[u]){
                if (v==i){
                    prev[i][i] = u;
                    return dist[i][u]+1;
                }else if (dist[i][v]<0){
                    dist[i][v] = dist[i][u]+1;
                    prev[i][v] = u;
                    list.add(v);
                }
            }
        }
        return -1;
    }
}