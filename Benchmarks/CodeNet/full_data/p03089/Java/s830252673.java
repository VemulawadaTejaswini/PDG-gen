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
    static LinkedList<Integer> ans = new LinkedList<>();
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] b = new int[n+1];
        for(int i=1;i<=n;i++) b[i]=sc.nextInt();
        if(!check(b,n)){
            System.out.println(-1);
            return;
        }
        solve(1,n,b);
        if(ans.size()!=n){
            System.out.println(-1);
        }else{
            for(int w:ans) System.out.println(b[w]);
        }
    }
    static void solve(int left, int right, int[] b){
        if(left>right) return;
        if(left==right){
            ans.add(left);
            return;
        }
        int mini = Integer.MAX_VALUE/2;
        for(int i=left;i<=right;i++) mini = Math.min(mini,b[i]);
        int idx = right;
        for(int i=right;i>=left;i--){
            if(b[i]==mini){
                idx = i;
                break;
            }
        }
        ans.add(idx);
        solve(idx+1,right,b);
        solve(left,idx-1,b);
    }
    static boolean check(int[] b, int n){
        for(int i=1;i<=n;i++){
            if(b[i]>i) return false;
        }
        return true;
    }
}