import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        int min = Integer.MAX_VALUE;
        int minpos = 0;
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i] < min){
                 min = a[i];
                 minpos = i;
            }
        }
        sc.close();

        long ans = 0;
        int[][] b = new int[n][n];
        
        for(int i=0; i<n; i++){
            ans += b[0][i] = a[i];
        }
        for(int i=1; i<n; i++){
            long mans = i*x + min;
            b[i][minpos] = min;
            for(int j=1; j<n; j++){
                int mpos = minpos + j;
                if(mpos >= n) mpos -= n;
                {
                    int npos = mpos - i;
                    if(npos < 0) npos += n;
                    mans += b[i][mpos] = Math.min(b[i-1][mpos], a[npos]);
                }
            }
            if(mans < ans) ans = mans;
        }

        System.out.println(ans);
	}
}
