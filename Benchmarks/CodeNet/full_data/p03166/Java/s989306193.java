import java.util.*;
public class Main {
    static Map<Integer,List<Integer>> map = new HashMap();
    static int dp[] = new int[100001];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edges = sc.nextInt();
        int dp[] = new int[n+1];
        int ans = 0;
        for(int i=0;i<edges;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(!map.containsKey(a))
                map.put(a,new ArrayList());
            map.get(a).add(b);
        }
        for(int i=1;i<=n;i++){
            ans = Math.max(ans,dfs(i));
        }
        System.out.println(ans);
    }
    static int dfs(int cur){
        int tmp = 0;
        if(dp[cur]!=0){
            return dp[cur];
        }
        if(!map.containsKey(cur))
            return 0;
        for(int next : map.get(cur))
            tmp = Math.max(tmp,dfs(next)+1);
        dp[cur] = tmp;
        return tmp;
    }
}
