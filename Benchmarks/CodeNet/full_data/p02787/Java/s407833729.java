import java.util.*;
 
import java.io.*;
 
public class Main{

    public static long Combination(long n, long r){
        long A = 1;
        long B = 1;
        for(long i = 0; i < r; i++){
            A = A*(n-i);
            B = B*(r-i);
        }
        if(A == 0) return 0;
        return A/B;
    }

    public static long solve(int i, int j, boolean check, int N, String S){
        if(i == N){
            if(j == 0){
                return 1;
            }else{
                return 0;
            }
        }

        if(j == 0) return 1;

        if(check){
            return Combination(N-i, j)*(long)Math.pow(9, j);
        }else{
            if(S.charAt(i) == '0') return solve(i+1, j, false, N, S);
            long Z = solve(i+1, j, true, N, S);
            long A = solve(i+1, j-1, true, N, S)*(S.charAt(i)-'1');
            long P = solve(i+1, j-1, false, N, S);
            return Z+A+P;
        }


    }
    
    public static long Dflag(long a){
        if(a == 1) return 1;
        long h = Dflag(a/2);
        return h + h + 1;
    }
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int N = s.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
            B[i] = s.nextInt();
        }

        long[][] dp = new long[N+1][H+1];
        for(int i = 0; i < H+1; i++){
            dp[0][i] = Long.MAX_VALUE;
        }
        for(int i = 1; i < N+1; i++){
            dp[i][1] = A[i-1];
        }

        for(int i = 0; i < N; i++){
            for(int h = 1; h <= H; h++){
                if(h <= A[i]){
                    dp[i+1][h] = Math.min(dp[i][h], B[i]);
                }else{
                    dp[i+1][h] = Math.min(dp[i+1][h-1]+B[i], dp[i][h]);
                }
                
            }
            
        }

        System.out.println(dp[N][H]);
	}
} 