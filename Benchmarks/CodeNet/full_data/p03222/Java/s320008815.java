import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int MOD = 1000000007;

		// 計算
		long result = 0;
		long[][] c = new long[w][2];
		c[0][0] = 1;
		c[0][1] = 1;
		if(w > 1){
		    c[1][0] = 1;
		    c[1][1] = 2;
		}
		for(int i = 2; i < w; i++){
		    c[i][0] = (c[i-2][0] + c[i-2][1])%MOD;
		    c[i][1] = (c[i-1][0] + c[i-1][1])%MOD;
		}
		long[][] d = new long[h+1][w+2];
		d[0][1] = 1;
		for(int i = 1; i <= h; i++){
		    for(int j = 1; j <= w; j++){
		        long cr = 1;
		        long cl = 1;
		        long cr2 = 1;
		        long cl2 = 1;
		        if(w-j-1 > 0) cr = (c[w-j-2][0] + c[w-j-2][1])%MOD;
		        if(w-j-2 > 0) cr2 = (c[w-j-3][0] + c[w-j-3][1])%MOD;
		        if(j-2 > 0) cl = (c[j-3][0] + c[j-3][1])%MOD;
		        if(j-3 > 0) cl2 = (c[j-4][0] + c[j-4][1])%MOD;
		        d[i][j] = (d[i-1][j-1] * cl2 * cr)%MOD
		                + (d[i-1][j] * cl * cr)%MOD
		                + (d[i-1][j+1] * cl * cr2)%MOD;
		        d[i][j] %= MOD;
		    }
		}
		result = d[h][k];

		// 出力
		System.out.println(result);
		
	}
}