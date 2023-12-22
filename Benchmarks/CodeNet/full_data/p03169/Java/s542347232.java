import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = 0, c = 0, d = 0;
        for(int i = 0; i < n; i++){
            switch(scanner.nextInt()){
                case 1 : b++;break;
                case 2 : c++;break;
                case 3 : d++;break;
                default:
                    break;
            }
        }

        Double[][][] dp = new Double[n+1][n+1][n+1];
        System.out.println(new Main().f(dp, b, c, d, n));
    }

    public double f(Double[][][] dp, int b, int c, int d, int n){
        if(b < 0 || c < 0 || d < 0){
            return 0;
        }
        if(dp[b][c][d] != null){
            return dp[b][c][d];
        }
        double sum = b + c + d;
        if(sum == 0)
            return 0;
        dp[b][c][d] = n / sum
                    + b / sum * f(dp, b-1,c,d,n)
                    + c / sum * f(dp, b+1,c-1,d,n)
                    + d / sum * f(dp, b,c+1,d-1,n);
        return dp[b][c][d];
    }
}
