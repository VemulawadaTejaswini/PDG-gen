import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static long[] dp;
    private static long cost(int current, int[] arr, int k){
        if(current >= arr.length) return Long.MAX_VALUE;
        if(current == arr.length - 1) return 0;
        if(dp[current] != -1) return dp[current];
        long ans = Long.MAX_VALUE;
        for(int i = 1; i <= k; i++){
            long x = cost(current + i, arr, k);
            if(x != Long.MAX_VALUE) x += Math.abs(arr[current] - arr[current + i]);
            ans = Math.min(ans, x);
        }
        dp[current] = ans;
        return dp[current];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // code goes here
        int[] in = nextIntArray(br, 2);
        int n = in[0];
        int k = in[1];
        int[] arr = nextIntArray(br, n);
        dp = new long[n];
        Arrays.fill(dp, -1);
        sb.append(cost(0, arr, k));
        System.out.print(sb.toString());
    }

    private static int nextInt(BufferedReader br) throws IOException{
        return Integer.parseInt(br.readLine());
    }

    private static int[] nextIntArray(BufferedReader br, int n) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    static class Pair<A, B>{
        A first;
        B second;
        public Pair(A first, B second){
            this.first = first;
            this.second = second;
        }
    }
}