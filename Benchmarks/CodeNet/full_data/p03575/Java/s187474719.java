import java.util.*;

class Main{
    private static HashSet<Integer>[] g;
    private static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        g = new HashSet[N+1];
        for(int i=0; i<=N; i++){
            g[i] = new HashSet<>();
        }
        int[][] edge = new int[M][2];
        for(int i=0;i<M;i++){
            edge[i][0] = sc.nextInt();
            edge[i][1] = sc.nextInt();
            g[edge[i][0]].add(edge[i][1]);
            g[edge[i][1]].add(edge[i][0]);
        }
        int cnt = 0;
        for(int i=0;i<M; i++){
            int left = edge[i][0];
            int right = edge[i][1];
            if(isBridge(left,right)) cnt++;
        }
        System.out.println(cnt);
    }
    private static boolean isBridge(int left, int right){
        boolean[] visited = new boolean[N+1];
        LinkedList<Integer> fringe = new LinkedList<>();
        fringe.add(left);
        visited[left]=true;
        while(fringe.size()>0){
            int cur = fringe.remove();
            for(Integer w:g[cur]){
                if(cur==left&&w==right) continue;
                if(!visited[w]){
                    visited[w]=true;
                    fringe.add(w);
                }
            }
        }
        return !visited[right];
    }
}