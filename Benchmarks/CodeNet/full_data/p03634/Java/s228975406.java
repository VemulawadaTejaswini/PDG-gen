import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List <Edge>G[];
    static int n, q, k, x[], y[];
    static long path[];
    static boolean used[];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        G = new List[n];
        used = new boolean[n];
        path = new long[n];
        for(int i = 0;i < n;i++)G[i] = new LinkedList<>();
        for(int i = 0;i < n-1;i++){
            int a, b, c;
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            G[a-1].add(new Edge(b-1, c));
            G[b-1].add(new Edge(a-1, c));
        }
        q = scan.nextInt();
        k = scan.nextInt();
        x = new int[q];  y = new int[q];
        for(int i = 0;i < q;i++){
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        used[k-1] = true;
        search(k-1);

        /*for(int i = 0;i < n;i++){
            System.out.println(k+"番目から"+(i+1)+"番目までのコストは"+path[i]+"である");
        }*/
        for(int i = 0;i < q;i++){
            long ans = path[x[i]-1]+path[y[i]-1];
            System.out.println(ans);
        }
    }

    static void search(int v){
        for(int i = 0;i < G[v].size();i++){
            Edge e = G[v].get(i);
            if(!used[e.to]){
                path[e.to] = path[v] + e.cost;
                used[e.to] = true;
                search(e.to);
            }
        }
        return;
    }
}

class Edge{
    int to;
    int cost;

    Edge(int to, int cost){
        this.to = to;
        this.cost = cost;
    }
}