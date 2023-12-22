import java.util.*;

public class Main {

    public static long dp[][] = new long[100001][2];
    public static long mod = (long)1000000007;

    public static long solve(int src,int constraint,int parent,ArrayList<ArrayList<Integer>> arr){
        if(dp[src][constraint] != -1) return dp[src][constraint];
        long ans = 0;
        long ans1 = 1;
        for(Integer child : arr.get(src)){
            if(child != parent)
            ans1 = (ans1 * solve(child,0,src,arr))%mod;
        }
        ans = (ans + ans1)%mod;
        if(constraint == 0){
            long ans2 = 1;
            for(Integer child : arr.get(src)){
                if(child != parent)
                ans2 = (ans2 * solve(child,1,src,arr))%mod;
            }
            ans = (ans + ans2)%mod;
        }
        return dp[src][constraint] = ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ArrayList<Integer> old = arr.get(a);
            old.add(b);
            arr.set(a,old);
            ArrayList<Integer> old1 = arr.get(b);
            old1.add(a);
            arr.set(b,old1);
        }

        for(int i=0;i<=100000;i++){
            for(int j=0;j<=1;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(1,0,-1,arr));

    }
}