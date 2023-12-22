import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static long setdp(char[][] maze ,long[][] dp , int i , int j , int rows , int cols , int mod){

            //System.out.println(i+" "+j+" check");
            if(i==0 && j==0) return dp[0][0];
            if(i<0 || j<0 ) return 0;
            if(i>=rows || j>=cols) return 0;
            if(maze[i][j]=='#') return 0;
            if(dp[i][j]!=-1) return dp[i][j];

            else
                dp[i][j] = setdp(maze,dp,i-1,j,rows,cols,mod)+setdp(maze,dp,i,j-1,rows,cols,mod);

            return dp[i][j]%mod;

        }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mod = 1000000007;
        int rows = in.nextInt();
        int col = in.nextInt();

        char[][] maze = new char[rows][col];

        for(int i=0;i<rows;i++)
        {

            String x = in.next();
            maze[i] = x.toCharArray();

        }


        long[][] dp = new long[rows][col];

        for(int i=0;i<rows;i++)
            Arrays.fill(dp[i],-1);


        dp[0][0]=0;

        for(int i =0 ;i<rows;i++){

            for(int j=0;j<col;j++ ){

                    if(i==0 && j==0 ) dp[i][j] = 1;
                    else
                    setdp(maze,dp, i, j, rows, col,mod);
                }

            }



//        for(int i =0 ;i<rows;i++){
//
//            for(int j=0;j<col;j++ ){
//
//                System.out.print(dp[i][j]+" ");
//
//
//            }
//
//            System.out.println();
//
//        }


        System.out.println(dp[rows-1][col-1]%mod);




    }



}
