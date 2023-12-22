import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[] x = new long[n];
		for(int i = 0; i < n; i++){
		    x[i] = sc.nextLong();
		}
		
		// 計算
		long result = Long.MAX_VALUE;
		for(int i = 1; i < 101; i++){
		    long temp = 0;
		    for(int j = 0; j < n; j++){
		        temp += (x[j]-i)*(x[j]-i);
		    }
		    result = min(result, temp);
		}
		
		
		// 出力
		System.out.println(result);
	}
}

