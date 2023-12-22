import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in); 
	
	double N = keyboard.nextDouble();
	double K = keyboard.nextDouble();
	
	double NN = 10.0;
	int T =  (int) (N / NN * 100);
	
	double[] W = new double[T];
	
	if(N > K) {
	Double S = N - K;
	}else {
		Double S  = N;
	}
	
	for(int i = 0 ; i < N; i++) {
		W[i] = 0.5 * (1 / K); 
	}
	double ans = 0;
	for(int j = 0; j < T ; j++) {
		ans =+ W[j] ;
	}
	
	System.out.println(ans);
	keyboard.close();
	}	
}