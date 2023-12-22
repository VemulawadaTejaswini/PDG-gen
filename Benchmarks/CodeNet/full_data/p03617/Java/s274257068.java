import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long Q = sc.nextInt();
    	long H = sc.nextInt();
    	long S = sc.nextInt();
    	long D = sc.nextInt();
    	long N = sc.nextInt();
    	if (S <= 4*Q && S <= 2*H) {
    		if (2*S < D) {
    			System.out.println(S*N);
    		} else {
    			System.out.println(N/2*D + N%2*S);
    		}
    	} else if (4*Q <= S && 2*Q <= H) {
    		if (8*Q < D) {
    			System.out.println(4*Q*N);
    		} else {
    			System.out.println(N/2*D + N%2*4*Q);
    		}
    	} else {
    		if (4*H < D) {
    			System.out.println(2*H*N);
    		} else {
    			System.out.println(N/2*D + N%2*2*H);
    		}
    	}
    }
}