import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextInt();
		long X = stdIn.nextInt();
		
		long ans = N;
		
		if(N - X < X){
			ans += square(N - X, X);
		} else{
			ans += square(X, N - X);
		}
		
		System.out.println(ans);
	}
	
	private static long square(long S, long L){
		
		long Q = L/S;
		long R = L%S;
		
		if(R == 0){
			return S*(2*Q - 1);
		} else{
			return S*(2*Q) + square(R, S);
		}
	}
}