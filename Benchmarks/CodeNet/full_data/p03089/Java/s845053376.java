import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static int n,k;
    static long mod = 1000000000+7;
    static long[] fac,inv;
    static int[] id,size;
    //static long mod = 1000000000+7;
    //static HashSet<Integer>[] graph;
    //static ArrayList<Integer>[] graph;
    static ArrayList<Integer> ans = new ArrayList<>();
    static boolean flag = true;
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n+1];
        for(int i=1;i<=n;i++) b[i]=sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(10,(a1,a2)->(a2-a1));
        boolean[] vis = new boolean[n+1];
        //List<Integer> res = new ArrayList<>();
        for(int step=1;step<=n;step++){
            pq.clear();
            for(int i=1;i<=n;i++){
                if(vis[i]) continue;
                if(b[i]>step) continue;
                int cnt = 0;
                for(int w:ans) cnt+=w<i?1:0;
                if(cnt!=b[i]-1) continue;
                //vis[i] = true;
                pq.add(i);
            }
            if(pq.size()==0){
                flag = false;
                break;
            }else{
                int w = pq.poll();
                ans.add(w);
                vis[w] = true;
            }
        }
        if(!flag||ans.size()!=n) System.out.println(-1);
        for(int w:ans) System.out.println(b[w]);
    }
    /*static boolean check(int[] b, int n){
        for(int i=1;i<=n;i++){
            if(b[i]>i) return false;
        }
        return true;
    }*/
}