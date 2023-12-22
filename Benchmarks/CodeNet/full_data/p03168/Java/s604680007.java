

import java.util.Scanner;

public class Main {
    public static double[][] probs;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        probs = new double[n+1][n+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                probs[i][j] = 0;
            }
        }
        probs[0][0] = 1;
        double[] coins = new double[n+1];
        for(int i = 1; i <= n; i++){
            coins[i] = scanner.nextDouble();
        }
        coins(coins, n);
        double res = 0;
        for(int i = n/2 +1; i <= n; i++){
            res += probs[i][n];
        }
        System.out.println(res);
    }

    public static void coins(double[] coins, int n){
        for(int c = 1; c <= n; c++){
            for(int h = 0; h <= c; h++){
                if(h==c){
                    probs[h][c] = probs[h-1][c-1] * coins[c];
                }else if(h==0){
                    probs[h][c] = probs[h][c-1] * (1-coins[c]);
                }else{
                    probs[h][c] = probs[h][c-1] * (1-coins[c]) + probs[h-1][c-1] * coins[c];
                }
            }
        }
    }
}
