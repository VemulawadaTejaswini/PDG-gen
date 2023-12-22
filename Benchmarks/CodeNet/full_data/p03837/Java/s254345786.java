import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    static HashMap<String,Integer> mem = new HashMap<>();
    static ArrayList<Integer>[] vertice;
    static int[] visited;
    static int [] cost ;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int m = in.nextInt();
        visited = new int[n+1];
        int ans = 0;
        vertice = new ArrayList[n+1];
        for(int i =0;i<=n;i++){
            vertice[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            vertice[a].add(b);
            vertice[b].add(a);
            String t = Integer.toString(a)+"-"+Integer.toString(b);
            String t2 = Integer.toString(b)+"-"+Integer.toString(a);
            mem.put(t,c);
            mem.put(t2,c);
        }

        for(int i =1;i<n;i++){
            cost = new int[n+1];
            for(int k=0;k<=n;k++){
                visited[k]=0;
            }
            visited[i]=1;
            for(int j=i+1;j<=n;j++){
                String t = Integer.toString(i)+"-"+Integer.toString(j);
                if(mem.containsKey(t)){
                    cost[j]=mem.get(t);
                }
            }
            bfs(i);
            for(int j=i+1;j<=n;j++){
                String t = Integer.toString(i)+"-"+Integer.toString(j);
                if(mem.containsKey(t)){
                    if( mem.get(t)!= cost[j]){
                        ans++;
                    }
                }
            }
        }
        System.out.println(+ans);


    }
    public static void bfs(int node){
        for(int v :vertice[node]){
            String t = Integer.toString(node)+"-"+Integer.toString(v);
            if(cost[v]==0){
                cost[v]=mem.get(t);
            }
            else {
                cost[v] = Math.min(cost[v],cost[node]+mem.get(t));
            }
            if(visited[v]==0){
                visited[v]=1;
                bfs(v);
            }
        }
    }
}
