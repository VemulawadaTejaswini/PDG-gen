import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float[] p = new float[n];

        for(int i = 0; i < n; i++){
            p[i] = sc.nextFloat();
        }

        int T = 0;
        int H = 1;
        float[][] a = new float[n][n+1];

        a[0][0] = 1 - p[0];
        a[0][1] = p[0];

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i+1; j++){
                if(j != 0)
                a[i][j] = p[i]*(a[i-1][j-1]) + (1-p[i])*(a[i-1][j]);
            }
        }

        float ans = 0;

        for(int i = (int) Math.ceil(n/2.0); i <= n; i++){
            ans += a[n-1][i];
        }

        System.out.println(ans);
    }
}
