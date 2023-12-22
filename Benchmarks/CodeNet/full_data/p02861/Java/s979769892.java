import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] M = new double[2*N];
		for(int i=0;i<2*N; i++) {
			M[i] = sc.nextDouble();
		}
		double S = 0;
		for(int i = 0;i < N; i= i+2 ) {
			int j = 0;
			double k = 0;
			while(i < 2*N && j < N*2) {
			k=(M[i]-M[j])*(M[i]-M[j])+(M[i+1]-M[j+1])*(M[i+1]-M[j+1]);
			S+= Math.sqrt(k);
			j = j+2;
			System.out.println(k);
			}
		}
		double A = 0;
		for(int i = 0; i < N; i++) {
			A = S/(N-i);
		}
		System.out.println(A);
	}
}