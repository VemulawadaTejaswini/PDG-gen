import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] ans = new long[N][N];

        long[] x = new long[]{1,2,4,7,12,20,33,54,88,133};

        for(int i=0; i<N; i++){
            long off = i==0 ? 1 : ans[i-1][N-1]+ans[i-1][N-2]+1;
            for(int j=i+1; j<N; j++){
                ans[i][j] = x[j-i-1]*off;
                ans[j][i] = ans[i][j];
            }

        }
        for(int i=0; i<N; i++){
            //for(int j=0; j<N; j++) System.err.printf("%15d", ans[i][j]);
            //System.err.println();
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(ans[i][j]);
                if(j+1==N) System.out.println();
                else System.out.print(" ");
            }
        }
    }
}