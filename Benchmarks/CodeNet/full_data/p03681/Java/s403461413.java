
import java.util.Scanner;

public class Main {
	static long a = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    sc.close();
	    
	    if (N-M>1 || N-M<-1)
	    	System.out.println(0);
	    
	    else {
	    	long ans = 1;
	    	for(int i = 1; i<=N; i++) {
	    		ans *= i;
	    		ans = ans % a;
	    	}
		
	    	for(int i = 1; i<=M; i++) {
	    		ans *= i;
	    		ans = ans % a;
	    	}
		
	    	if(N == M) {
	    		ans *= 2;
	    		ans = ans % a;
	    		System.out.println(ans);
	    	}
	    	else {
	    		System.out.println(ans);
	    	}
	    }
	}
}