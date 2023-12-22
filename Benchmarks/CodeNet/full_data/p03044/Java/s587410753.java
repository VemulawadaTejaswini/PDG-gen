import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int n,a,b,k;
    static HashMap<Integer,Integer>[] g;
    static int[] ans;
    public static void main(String[] args) throws Exception{
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] buf = reader.readLine().split(" ");
        n = Integer.parseInt(buf[0]);
        ans = new int[n+1];
        g = new HashMap[n+1];
        for(int i=0;i<=n;i++) g[i]=new HashMap<>();
        for(int i=0;i<n-1;i++){
            buf = reader.readLine().split(" ");
            int u = Integer.parseInt(buf[0]), v = Integer.parseInt(buf[1]);
            int len = Integer.parseInt(buf[2]);
            g[u].put(v,len); g[v].put(u,len);
        }
        ans[1]=1;
        for(int w:g[1].keySet()) dfs(w,1);
        PrintWriter out = new PrintWriter(System.out);
        for(int i=1;i<=n;i++) out.println(ans[i]);
        out.flush();
    }
    static void dfs(int cur, int from){
        int len = g[cur].get(from);
        if(len%2==0) ans[cur]=ans[from];
        else ans[cur] = 1-ans[from];
        for(int w:g[cur].keySet()){
            if(w==from) continue;
            dfs(w,cur);
        }
    }
}

