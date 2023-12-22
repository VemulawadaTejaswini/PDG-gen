import java.util.*;

public class Main {
    static int n, k;
    static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        int amin = Arrays.stream(a).min().getAsInt();
        if(amin > k){
            System.out.println(n);
            return;
        }else if(amin == k){
            int ans = n;
            for(int i=0; i<n; i++){
                if(a[i] == amin) ans--;
            }
            System.out.println(ans);
            return;
        }

        Arrays.sort(a);

        if(!checkNeed(n-1)){
            System.out.println(n);
            return;
        }


        int l = 0, r = n-1;
        while(r-1>l){
            int m = (l+r)/2;
            if(checkNeed(m)){
                r = m;
            }else{
                l = m;
            } 
        }



        System.out.println(l+1);
    }

    static boolean checkNeed(int pos){
        if(a[pos] > k) return true;

        boolean[][] dp = new boolean[n][k*2];
        dp[0][0] = true;
        dp[0][a[0]] = true;
        for(int i=1; i<n; i++){
            dp[i][0] = true;
            for(int j=0; j<k*2; j++){
                dp[i][j] = dp[i-1][j];
            }
            if(i == pos) continue;
            for(int j=0; j<k*2 - a[i]; j++){
                if(dp[i-1][j]) dp[i][j+a[i]] = true;
            }
        }

        for(int i=k-a[pos]; i<k; i++){
            if(dp[n-1][i]) return true;
        }
        return false;
    }
}