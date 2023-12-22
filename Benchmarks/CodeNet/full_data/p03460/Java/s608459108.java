import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

class Main{
    static int[][] map = new int[4000][4000];
    static int[][] sum = new int[4001][4001];
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        for(int[] mp : map)Arrays.fill(mp,0);
        for(int[] mp : sum)Arrays.fill(mp,0);
        for(int i=0;i<N;++i){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(scan.next().equals("W"))x+=K;
            y%=2*K;x%=2*K;
            map[y][x]++;
        }
        for(int i=0;i<2*K;++i)for(int j=0;j<2*K;++j){
            map[i][j+2*K]=map[i][j];
            map[i+2*K][j]=map[i][j];
            map[i+2*K][j+2*K]=map[i][j];
        }

        sum = new int[4*K+1][4*K+1];
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