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
        
        int sum[][] = new int[3][C];
        for(int k = 0; k < C; k++ ) {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    int x = (i+j)%3;
                    sum[x][k] += D[c[i][j]][k];
                }
            }
        }
        
        int min = 5000;
        for( int x = 0; x < C; x++ ) {
            for(int y = 0; y < C; y++ ) {
                if( x == y ) continue;
                for( int z = 0; z < C; z++ ) {
                    if( x == z ) continue;
                    if( y == z ) continue;
                    int minTemp = sum[0][x] + sum[1][y] + sum[2][z];
                    min = Math.min( min, minTemp );
                }
            }
        }
        
        System.out.println( min );
    }
}
