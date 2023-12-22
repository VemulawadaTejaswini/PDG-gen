import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算
		long[] result = new long[k];
		for(int i = 1; i <= k; i++){
		    // n-k+1Ci % 1000000007
		    double a = 1;
		    double b = 1;
		    for(int j = 1; j <= i; j++){
		        a = a * ((n - k + 1) - (j - 1));
		        b = b * j;
		    }
		    
		    // k-1Ci-1
		    double c = 1;
		    double d = 1;
		    for(int j = 1; j <= i - 1; j++){
		        c = c * ((k - 1) - (j - 1));
		        d = d * j;
		    }
		    //System.out.println("i:" + i + " a/b:" + a/b);
		    //System.out.println("i:" + i + " c/d:" + c/d);
		    result[i-1] = (long)((a/b)*(c/d))%1000000007;
		}

		// 出力
		for(int i = 0; i < k; i++){
		    System.out.println(result[i]);
		}
	}
}
