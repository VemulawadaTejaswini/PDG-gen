import java.util.*;

/**
 * Created by Harry on 4/1/20.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer>[] graph = new ArrayList[n+1];
        int[] in = new int[n+1];
        for(int i=0; i<m; i++){
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            if(graph[from]==null){
                graph[from] = new ArrayList<>();
            }
            graph[from].add(to);
            in[to]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int node=1; node<=n; node++){
            if(in[node]==0){
                q.offer(node);
            }
        }

        int res = 0;
        int[] len = new int[n+1];
        while(!q.isEmpty()){
            int node = q.poll();
            if(graph[node]==null) continue;
            for(int next : graph[node]){
                len[next] = Math.max(len[next], len[node]+1);
                res = Math.max(res, len[next]);
                if(--in[next]==0){
                    q.offer(next);
                }
            }
        }
        System.out.print(res);
    }
}
