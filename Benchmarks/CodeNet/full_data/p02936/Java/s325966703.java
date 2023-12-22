import java.util.*;

public class Main{
    static final int INF = (int)1e9;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        ArrayList<Integer>[] ch = new ArrayList[n];
        for(int i=0; i<n; i++){
            ch[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            ch[a-1].add(b-1);
        }
        
        long[] ans = new long[n];
        for(int i=0; i<m; i++){
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            ans[p-1] += x;
        }
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offerFirst(0);
        while(q.size()!=0){
            int now = q.removeLast();
            for(int next : ch[now]){
                ans[next] += ans[now];
                q.offerFirst(next);
            }
        }
        
        System.out.print(ans[0]);
        for(int i=1; i<n; i++){
            System.out.print(" " + ans[i]);
        }
        System.out.println("");
    }
}
