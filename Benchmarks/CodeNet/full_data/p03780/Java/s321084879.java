import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        boolean[] need = new boolean[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        int amin = Arrays.stream(a).min().getAsInt();
        if(amin >= k){
            System.out.println(n);
            return;
        }

        for(int i=0; i<n; i++){
            if(a[i] + amin >= k && a[i] != amin){
                need[i] = true;
            }
        }

        boolean[][] dp = new boolean[n][k*2];
        dp[0][0] = true;
        if(a[0] < k*2) dp[0][a[0]] = true;
        for(int i=1; i<n; i++){
            dp[i][0] = true;
            for(int j=0; j<k*2-a[i]; j++){
                if(dp[i-1][j]) dp[i][j+a[i]] = true;
            }
        }

        for(int i=0; i<n; i++){
            if(need[i]) continue;
            for(int j=k; j<k*2; j++){
                if(dp[n-1][j] && j-a[i]>=1 && j-a[i]<k) need[i] = true; 
            }
        }

        int ans = 0;
        for(int i=0; i<n; i++) if(!need[i]) ans++;
        System.out.println(ans);
    }
}