import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        
        int D[][] = new int[C][C];
        for(int i = 0; i < C; i++) {
            for(int j = 0; j < C; j++) {
                D[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                c[i][j] = sc.nextInt() - 1;
            }
        }
        
        long sum[][] = new long[3][C];
        for(int k = 0; k < C; k++ ) {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    sum[(i+j)%3][k] += D[c[i][j]][k];
                }
            }
        }
        
        long min = Long.MAX_VALUE;
        for( int x = 0; x < C; x++ ) {
            for(int y = 0; y < C; y++ ) {
                if( x == y ) continue;
                for( int z = 0; z < C; z++ ) {
                    if( x == z ) continue;
                    if( y == z ) continue;
                    min = Math.min( min, sum[0][x] + sum[1][y] + sum[2][z] );
                }
            }
        }
        
        System.out.println( min );
    }
}
