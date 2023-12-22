import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    long mod = 1000000000+7;
    int cnt2 = 0;
    ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    String solve() throws IOException {
        int n = sc.nextInt();
        tree = new ArrayList[n+1];
        for(int i=0;i<=n;i++) tree[i] = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            tree[a].add(b); tree[b].add(a);
        }
        int[] color = new int[n+1];
        dfs(1,1,1,color);
        Deque<Integer> one = new LinkedList<>(), two = new LinkedList<>(), three = new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(i%3==1) one.add(i);
            else if(i%3==2) two.add(i);
            else three.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            int ans;
            if(color[i]==1&&one.size()>0){
                ans = one.pollFirst();
            } else if(color[i]==2&&two.size()>0){
                ans = two.pollFirst();
            } else {
                if(three.size()>0) ans = three.pollFirst();
                else return "-1";
            }
            sb.append(ans).append(' ');
        }
        return sb.toString();
    }
    void dfs(int cur, int from, int cur_color, int[] color){
        color[cur] = cur_color;
        for(int to:tree[cur]){
            if(to==from) continue;
            dfs(to,cur,3-cur_color,color);
        }
    }
}