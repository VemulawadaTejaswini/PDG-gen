import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = gcd(a,b);
		
		// 計算
		long result = 1;
		//System.out.println("n:" + n + "sqrt:" + sqrt(n));
		ArrayList<NumList> list = new ArrayList<NumList>();
		for(int m = 2; m <= sqrt(n); m++){
		    if(n == 1) break;
		    if(n%m == 0){
		        NumList numList = new NumList(m, 0);
		        while(n%m == 0){
		            n = n/m;
		            numList.num2++;
		        }
		        list.add(numList);
		    }
		}
		if(n != 1) list.add(new NumList(n, 1));
		result += list.size();
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
}

class NumList {
    long num1;
    long num2;
    
    NumList(long num1, long num2){
        this.num1 = num1;
        this.num2 = num2;
    }
}
