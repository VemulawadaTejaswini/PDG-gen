import java.util.*;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    long K = sc.nextLong();
	    long Q = sc.nextInt();
	    long[] ans = new long[N+1];
	    
	    for(int i = 1; i <= N; i++) {
	        ans[i] = K - Q;
	    }
	    
	    for(int j = 1; j <= Q; j++) {
	        int a = sc.nextInt();
	        ans[a]++;
	    }
	    
	    for(int k = 1; k <= N; k++) {
	        if(ans[k] <= 0) {
	            System.out.println("No");
	        }else {
	            System.out.println("Yes");
	        }
	    }
	}
}