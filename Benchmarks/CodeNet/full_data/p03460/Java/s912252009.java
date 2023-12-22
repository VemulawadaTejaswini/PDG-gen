import java.util.Scanner;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int[][] map = new int[4*K][4*K];
        for(int i=0;i<N;++i){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(scan.next().charAt(0)=='W')x+=K;
            map[y%(2*K)][x%(2*K)]++;
        }
        for(int i=0;i<2*K;++i)for(int j=0;j<2*K;++j){
            map[i][j+K]=map[i][j];
            map[i+K][j]=map[i][j];
            map[i+K][j+K]=map[i][j];
        }

        int[][] sum = new int[4*K+1][4*K+1];
        for(int i=0;i<4*K;++i)for(int j=0;j<4*K;++j){
            sum[i+1][j+1]=sum[i][j+1]+sum[i+1][j]-sum[i][j]+map[i][j];
        }

        int ans = 0;
        for(int i=1;i<=K;++i)for(int j=1;j<=K;++j){
            ans = Math.max(ans, sum[i+2*K-1][j+2*K-1]-sum[i+K-1][j+2*K-1]-sum[i+2*K-1][j+K-1]+sum[i+K-1][j+K-1]
                               +sum[i+K-1][j+K-1]    -sum[i-1][j+K-1]    -sum[i+K-1][j-1]    +sum[i-1][j-1]);
        }
        System.out.println(ans);


    }

}