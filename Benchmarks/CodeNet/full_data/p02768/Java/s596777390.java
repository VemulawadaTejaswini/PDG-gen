import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		long ans = (long)Math.pow(2, n)-1;
		long mod = (long)Math.pow(10, 9)+7;
		
		ans -= calcNumOfCombination(n, a);
		ans -= calcNumOfCombination(n, b);
	
		ans = ans%mod;
		System.out.println(ans);
		
		
		
	}
	
	public static long calcNumOfCombination(long n,long r){
        long  num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        
        return num;
    }
}

