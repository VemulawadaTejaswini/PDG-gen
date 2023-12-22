import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        List<LinkedList<Integer[]>> graph = new ArrayList<>();
        int s,t;
        int[] color = new int[n];
        int[] edge = new int[n-1];
        for(int i=0;i<n;i++){
            graph.add(new LinkedList<>());
        }
        for(int i=0;i<n-1;i++){
            s = Integer.parseInt(sc.next())-1;
            t = Integer.parseInt(sc.next())-1;
            graph.get(s).add(new Integer[]{t,i});
            graph.get(t).add(new Integer[]{s,i});
        }
        sc.close();
        Queue<Integer> queue = new ArrayDeque<>();
        int K = 0;
        queue.add(0);
        while(queue.size() > 0){
            int v = queue.poll();
            int now = 0;
            for(Integer[] i : graph.get(v)){
                if(edge[i[1]]==0){
                    now++;
                    if(now == color[v])now++;
                    color[i[0]] = edge[i[1]] = now;
                    queue.add(i[0]);
                }
            }
            K = Math.max(K,now);
        }
        
        PrintWriter out = new PrintWriter(System.out);
        out.println(K);
        for(int i=0;i<n-1;i++){
            out.println(edge[i]);
        }
        out.flush();

    }
    
}