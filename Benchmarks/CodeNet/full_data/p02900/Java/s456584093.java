import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextInt();
		long b = sc.nextInt();
		long n = gcd(a,b);
		ArrayList<Long> list = new ArrayList<Long>();
		//System.out.println("n:" + n);
		// 計算
		long result = 1;
		for(long i = 1; i <= n; i++){
		    if(n%i > 0) continue;
		    int flg = 0;
		    for(Long j : list){
		        if(i%j == 0){
		            flg = 1;
		            continue;
		        }
		    }
		    if(flg == 1) continue;
		    if(isPrime(i)){
		        //System.out.println("i:" + i);
		        list.add(i);
		        result++;
		    }
		}

		// 出力
		System.out.println(result);
        
	}
	
	static long gcd(long x, long y){
	    if(x < y){
	        long temp = x;
	        x = y;
	        y = temp;
	    }
	    if(y == 0) return x;
	    if(x%y == 0) return y;
	    return gcd(y , x%y);
	}
	
	public static boolean isPrime(long num) {
    if (num < 2) return false;
    else if (num == 2) return true;
    else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

    double sqrtNum = sqrt(num);
    for (long i = 3; i <= sqrtNum; i += 2)
    {
        if (num % i == 0)
        {
            // 素数ではない
            return false;
        }
    }

    // 素数である
    return true;
    }
}