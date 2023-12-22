import java.util.Scanner;

public class Vacation {
    static long dp[][] = new long[100005][3]; /// dp[dia][actividad]   para el dia d, actvidad j max abajo
    static int n;
    static int[][] matrix;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        matrix = new int[n][3];

        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                int curr = in.nextInt();
                matrix[i][j]=curr;
            }

        }
        solve(0,0); solve(0,1); solve(0,2);
        long max = Long.max(Long.max(dp[0][0],dp[0][1]), dp[0][2]);
        System.out.println(max);

    }

    public static long solve(int dia, int actividad) {
        // caso base
        if(dia == n-1) {dp[dia][actividad]=matrix[dia][actividad]; return matrix[dia][actividad];}
        if(dp[dia][actividad]!=0) return dp[dia][actividad];

        long a=0;long b=0; long c=0;
        if(actividad!=0)a = solve(dia+1,0) + matrix[dia][actividad]; 
        if(actividad!=1)b = solve(dia+1,1)+ matrix[dia][actividad];
        if(actividad!=2)c = solve(dia+1,2)+ matrix[dia][actividad]; 

        long max = Long.max(Long.max(a,b), c);
        dp[dia][actividad]=max;
        return max;
    }

}