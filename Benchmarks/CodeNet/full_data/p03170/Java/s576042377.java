import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        sc.close();
        int[] dp = new int[K+1];
        for(int i = 1; i <= K; i++){
            for(int j = 0; j < N; j++){
                if(A[j] <= i && dp[i - A[j]] == 0){
                    dp[i] = 1;
                    break;
                }
            }
        }
        System.out.println(dp[K] == 1 ? "First" : "Second");

    }

}
