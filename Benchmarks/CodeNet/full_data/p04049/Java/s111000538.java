import java.util.*;

class Main{
    static ArrayList<Integer>[] map;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        map = new ArrayList[n+1];
        for(int i=0;i<=n;i++) map[i]=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a].add(b);
            map[b].add(a);
        }
        long ans = 0;
        for(int i=1;i<=n;i++) ans=Math.max(ans,bfs(i,x));
        System.out.println(n-ans);
    }
    static int bfs(int root, int x){
        ArrayList<Integer> cur = new ArrayList<>(), next = new ArrayList<>();
        HashSet<Integer> vis = new HashSet<>();
        cur.add(root);
        for(int d=0;d<=x/2;d++){
            for(int i=0;i<cur.size();i++){
                int now = cur.get(i);
                vis.add(now);
                for(int w:map[now]){
                    if(!vis.contains(w)) next.add(w);
                }
            }
            cur=next;
            next = new ArrayList<>();
        }
        int ans = vis.size();
        if(x%2==1&&cur.size()>0) ans++;
        return ans;
    }
}
