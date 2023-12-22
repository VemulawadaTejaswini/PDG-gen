import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
	    long ans = 0;
	    long minsum = 0;
	    if(sosuu(N)) {
	        ans = N - 1;
	    }else {
	        for(int i = 2; i <= N; i++) {
	            for(int j = i; j <= N; j++) {
	                if(i * j == N) {
	                    if(minsum == 0) {
	                        minsum = i + j;
	                    }
	                    if(i+j < minsum) {
	                        minsum = i + j;
	                    }
	                }
	            }
	        }
	        ans = minsum - 2;
	    }
        
        System.out.println(ans);
	}
	
	static boolean sosuu(long n) {
	    if(n < 2) {
	        return false;
	    }
	    if(n == 2) {
	        return true;
	    }
	    if(n % 2 == 0) {
	        return false;
	    }
	    for(long i = 3; i <= Math.sqrt(n); i += 2) {
	        if(n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}