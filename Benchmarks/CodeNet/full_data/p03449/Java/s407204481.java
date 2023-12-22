import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[2][n];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = scan.nextInt();
            }
        }
        int[][] sum = new int[2][n];
        sum[0][0] = a[0][0];
        sum[1][0] = a[1][0];
        for(int i = 1; i < n; i++){
            sum[0][i] = sum[0][i - 1] + a[0][i];
            sum[1][i] = sum[1][i - 1] + a[1][i];
        }
        int out = 0;
        for(int i = 0; i < n; i++){
            out = Math.max(out, sum[0][i] + sum[1][n - 1] - sum[1][i] + a[1][i]);
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
