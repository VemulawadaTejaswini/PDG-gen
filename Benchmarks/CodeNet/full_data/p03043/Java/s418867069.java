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
		double result = 0;
		double[] a = new double[n+1];
		double prod = 1;
		double sum = 0;

        for(int i = 1; i <= n; i++){
		    result += (double)1/pow(2, count(i, k));
		}
		result = result*1/n;

		// 出力
		System.out.println(result);
	}
	
	static long count(int i, int k){
	    if(i >= k){
	        return 0;
	    }else{
	        return count(i*2, k) + 1;
	    }
	}
	
	public static long pow(long a,long n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a);
	        }
	        a=(a*a);
	        n>>=1;
	    }
	    return res;
	}
}