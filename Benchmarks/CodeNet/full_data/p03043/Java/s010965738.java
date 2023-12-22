import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in); 
	
	double N = keyboard.nextDouble();
	double K = keyboard.nextDouble();
	
	double S = 0.0;
	double ans = 0.0;
	
	if(N > K) {
		S = K - 1;
		ans +=  (1.0 / N * (N-K+1));
	}else {
		S = N;
	}
	
	for(int i = 1 ; i <= S; i++) {
		double P = 1.0 / N;
		int Q = i;
		
		while(Q < K) {
			Q = Q * 2;
			P = P * (1.0/2.0);
		}
		ans += P;
	}

	System.out.println(ans);
	keyboard.close();
	}	
}
