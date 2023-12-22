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
		for(int k = 2; k <= sqrt(n); k++){
		    if(n%k == 0){
		        long tmp = n;
		        while(tmp%k == 0){
		            tmp /= k;
		        }
		        if(tmp%k == 1) result++;
		    }
		}
		for(int k = 2; k <= sqrt(n); k++){
		    if(n%k != 0){
		        if((n-1)%k == 0){
		            result++;
		            if(k != 1 && (long)k*k != n) result++;
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
