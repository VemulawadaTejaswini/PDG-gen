
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();
        int[] p   = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();

        long[] dp =new long[n+1];
        int base = 1;
        while(base <= n) {
            base *= 2;
        }
        long[] tree = new long[2*base];
        for (int i = 0; i < n; i++) {
            int index = arr[i]+base;
            long max =0;
            while(index>1){
                if(index%2==1)
                    max = Math.max(max,tree[index-1]);
                index /=2;
            }
            dp[arr[i]] = max + p[i];
            int x = arr[i]+base;
            tree[x]=dp[arr[i]];
            while(x>0){
                x /=2;
                tree[x]  = Math.max(tree[2*x],tree[2*x +1]);
            }
        }
        long ans =0;
        for(long m : dp)
            ans = Math.max(m,ans);

        System.out.println(ans);
    }
}
