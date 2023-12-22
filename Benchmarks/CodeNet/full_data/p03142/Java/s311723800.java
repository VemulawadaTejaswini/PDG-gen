import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        int[] deg = new int[n+1];
        int[] ans = new int[n+1];
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        for(int i=0;i<=n;i++) graph[i]=new ArrayList<>();
        for(int i=0;i<n-1+m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            deg[v]++;
            graph[u].add(v);
        }
        int root = 0;
        for(int i=1;i<=n;i++){
            if(deg[i]==0) root = i;
        }
        LinkedList<Integer> que = new LinkedList<>();
        que.add(root);
        while(que.size()>0){
            int cur = que.poll();
            for(int w:graph[cur]){
                deg[w]--;
                if(deg[w]==0){
                    ans[w] = cur;
                    que.add(w);
                }
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        for(int i=1;i<=n;i++){
            out.println(ans[i]);
        }
        out.flush();
    }

}
