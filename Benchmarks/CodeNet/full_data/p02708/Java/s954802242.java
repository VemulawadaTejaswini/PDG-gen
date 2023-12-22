import java.util.*;
public class Main {
	static final long mn = (long) Math.pow(10,9)+7;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
        
        if(K==N+1){
        	System.out.println(1);
        	return;
        }
         if(K==N){
        	System.out.println(N+2);
        	return;
        }
        
        long ans = (long) 1;
        
        
		for (int i = K; i < N+1; i++) {
			ans += (i*(N-i+1)) + 1;
        }
        
        ans = ans%mn;
		System.out.println(ans);
        return;
	}
}
