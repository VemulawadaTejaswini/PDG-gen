import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double maxexp = 0;
		int p[] = new int[N];
		double exp[] = new double[N];

		for(int i=0;i<N;i++) {
			p[i] = sc.nextInt();
			exp[i] = ((double)1+p[i])/(double)2;
	//		System.out.println("p["+i+"]="+p[i]);
			
	//		System.out.println("exp["+i+"]="+exp[i]);
		}
		
		
		for(int i=0;i<N-K+1;i++) {
			double checkexp =0;
			
			for(int j=0;j<K;j++) {
				checkexp+=exp[i+j];
			}
	//		System.out.println(i+"ch:"+checkexp);
			
			if(checkexp > maxexp) {
				maxexp=checkexp;
			}		
		}
		
		System.out.println(maxexp);
	}	
}