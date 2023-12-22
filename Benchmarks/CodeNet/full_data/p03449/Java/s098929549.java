import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int [][] grid = new int [2][N];
        
        for (int i=0; i<2; i++) {
            for (int j=0; j<N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        
        for (int i=0; i<N; i++) {
            int sum = 0;
            for (int j=0; j<=i; j++) {
                sum += grid[0][j];
            }
            for (int j=i; j<N; j++) {
                sum += grid[1][j];
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
        
    }
}