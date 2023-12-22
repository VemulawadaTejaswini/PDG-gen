import java.util.*;

public class Main{
    static long mod = 1000000000+7;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        sc.close();

        long[][] cnt = new long[2][N];
        long[][] s = new long[2][N];
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(A[i] > A[j])
                    cnt[0][i]++;
            }
            for(int j = 0; j < N; j++){
                if(A[i] > A[j])
                    cnt[1][i]++;
            }
            if(i != 0){
                s[0][i] = s[0][i-1] + cnt[0][i];
                s[1][i] = s[1][i-1] + cnt[1][i];
            } else {
                s[0][i] = cnt[0][i];
                s[1][i] = cnt[1][i];
            }
        }

        long ans = 0;
        ans = (s[0][N-1]*K%mod + K*(K-1)/2%mod*s[1][N-1]%mod)%mod;
        System.out.println(ans);
   }
}