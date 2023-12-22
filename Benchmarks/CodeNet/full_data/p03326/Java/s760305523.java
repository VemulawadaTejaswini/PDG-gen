import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
    static int n;
    static int m;
    static long[][] xyz;
    static long max = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		n = sc.nextInt();
		m = sc.nextInt();
		xyz = new long[n][3];
		for(int i = 0; i < n; i++){
		    xyz[i][0] = sc.nextLong();
		    xyz[i][1] = sc.nextLong();
		    xyz[i][2] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		calc(0, 0, 0, 0, 0);
		result = max;
		
		// 出力
		System.out.println(result);
	}
	
	static void calc(int i, int cnt, long sumX, long sumY, long sumZ){
	    //System.out.println("i:" + i + " cnt:" + cnt);
	    if(cnt == m){
	        long sum = abs(sumX) + abs(sumY) + abs(sumZ);
	        max = max(max, sum);
	        //System.out.println("max:" + max);
	    }else{
	        if(i < n){
	            if(n-i > m-cnt) calc(i+1, cnt, sumX, sumY, sumZ);
	            calc(i+1, cnt + 1, sumX + xyz[i][0], sumY + xyz[i][1], sumZ + xyz[i][2]);
	        }
	    }
	}
}
