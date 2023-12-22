import java.util.Scanner;
import java.util.Collections;

class Main{
    static int[][] map;
    static int[][] sum;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        map = new int[3*K][3*K];
        for(int i=0;i<N;++i){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(scan.next().equals("W"))x+=K;
            y%=2*K;x%=2*K;
            map[y][x]++;
        }
        for(int i=0;i<2*K;++i)for(int j=0;j<K;++j)map[i][j+2*K]=map[i][j];
        for(int i=0;i<K;++i)for(int j=0;j<2*K;++j)map[i+2*K][j]=map[i][j];
        for(int i=0;i<K;++i)for(int j=0;j<K;++j)map[i+2*K][j+2*K]=map[i][j];

        sum = new int[3*K+1][3*K+1];
        for(int i=0;i<3*K;++i)for(int j=0;j<3*K;++j){
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