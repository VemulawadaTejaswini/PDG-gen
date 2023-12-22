
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
	    int time = 0;
		
	    if( A<=C && C<=B ) {
	    	if( B<=D ) {
	    		time = B-C;
	    	}else {
	    		time = D-C;
	    	}
	    }else if( C<A && A<=D ){
	    	if( D<=B ) {
	    		time = D-A;
	    	}else {
	    		time = B-A;
	    	}
	    }
	    
		System.out.println(time);
	}
}
