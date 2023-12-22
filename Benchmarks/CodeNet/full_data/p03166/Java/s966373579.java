import java.util.*;

public class Main {

    public static int solve(int i,int dp[],ArrayList<ArrayList<Integer>> arr){
        if(dp[i] != -1) return dp[i];

        int max = 0;
        int leaf = 1;

        for(Integer j : arr.get(i)){
            leaf = 0;
            max = Math.max(max,solve(j,dp,arr));
        }

        return dp[i] = (leaf == 1 ? 0 : 1 + max);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n,e;
        n = sc.nextInt();
        e = sc.nextInt();

       int dp[] = new int[n+1];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++) arr.add(new ArrayList<Integer>());

        for(int i=0;i<e;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.get(a).add(b);
        }


        for(int i=0;i<=n;i++) dp[i] = -1;
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = Math.max(ans,solve(i,dp,arr));
        }
        System.out.print(ans);

    }
}