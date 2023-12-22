import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] hap= new int[N][3];
        for(int i=0;i<N;i++){
            hap[i][0] = sc.nextInt();
            hap[i][1] = sc.nextInt();
            hap[i][2] = sc.nextInt();
        }
        System.out.println(vacation(N,hap));
    }
    static int vacation(int N, int[][] happineses){

        int[][] dp = new int[3][N];
        dp[0][0] =happineses[0][0];
        dp[1][0] =happineses[0][1];
        dp[2][0] =happineses[0][2];

        for(int i=1 ; i<N ; i++){//next day
            for(int k=0;k<3;k++) { // combination (k,i) &
                for (int j = 0; j < 3; j++) { //  (j, i-1)
                    if (j == k ) continue;
                     int   happiness = dp[j][i-1] + happineses[i][k];
                     if(happiness > dp[k][i]){
                         dp[k][i]= happiness;
                     }
                }
            }
        }

        return Math.max(dp[0][N-1],Math.max(dp[1][N-1],dp[2][N-1]));
    }
}