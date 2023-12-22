import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long[][] A = new long[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                A[i][j] = sc.nextLong();
            }
        }

        boolean[][] memo = new boolean[N][N];
        
        for(int k=0; k<N; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(A[i][j]>A[i][k]+A[k][j]){
                        System.out.println(-1);
                        return;
                    }
                    else if(A[i][j]==A[i][k]+A[k][j] && i!=k && j!=k){
                        memo[i][j] = true;
                    }
                }
            }
        }

        long ans = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!memo[i][j]){
                    ans += A[i][j];
                    memo[i][j] = true;
                    memo[j][i] = true;
                }
            }
        }
        System.out.println(ans);
    }
}