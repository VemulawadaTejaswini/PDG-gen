import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		double[] A = new double[N-1];
		double sum=0;

		for(int i=0 ; i<N ; i++){
			A[i] = 1/sc.nextInt();
		}

		for(int i=0;i<N;i++){
			sum = sum+A[i];
		}

		System.out.println(1/sum);
	}
}