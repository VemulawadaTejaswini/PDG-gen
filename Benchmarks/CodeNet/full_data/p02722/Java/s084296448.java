import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		
		// 計算
		long result = 2;
		if(n == 2) result = 1;
		for(long k = 2; k*k <= n; k++){
		    if(n%k == 0){
		        long tmp = n;
		        while(tmp%k == 0){
		            tmp /= k;
		        }
		        if(tmp%k == 1) result++;
		    }
		}
		for(long k = 2; k*k <= n; k++){
		    if(n%k != 0){
		        if((n-1)%k == 0){
		            result++;
		            if(k*k != (n-1)) result++;
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
