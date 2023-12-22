import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt(), M = sc.nextInt(), res = 0;
        int[] f = new int[N + 1],degree = new int[N + 1];
        ArrayList[] edges = new ArrayList[N + 1];
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i <= N; i ++)edges[i] = new ArrayList<Integer>();
        for(int i = 1; i <= M; i ++){
            int v = sc.nextInt(), u = sc.nextInt();
            edges[v].add(u);
            degree[u] ++;
        }
        for(int i = 1; i <= N; i ++)if(degree[i] == 0)q.offer(i);
        while(!q.isEmpty()){
            int cur = q.poll();
            for(Object end : edges[cur]){
                Integer e = (Integer)end;
                f[e] = Math.max(f[cur] + 1,f[e]);
                res = Math.max(res,f[e]);
                degree[e] --;
                if(degree[e] == 0)q.offer(e);
            }
        }

//        f[u] = Math.max(f[u],f[v] + 1);
//        res = Math.max(res,f[u]);
//        for(int i = 1 ; i <= N; i ++) System.out.print(f[i] + " ");
        System.out.println(res);
    }
}