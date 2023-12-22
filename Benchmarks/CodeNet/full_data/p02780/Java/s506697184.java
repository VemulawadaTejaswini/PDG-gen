import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			List<Double> E = new ArrayList<Double>(); 
			
			int pi;
			
			
			for(int i=1;i<=N;i++) {
				pi = sc.nextInt();
				E.add((pi+1.0)/2.0) ;
				
			}
			
			List<Double> sum = new ArrayList<Double>(); 
			
			for(int j=0;j<K-j;j++) {
				double SUM = 0.0;
				
				for(int m=j;m<=K+j-1;m++) {
					SUM += E.get(m);
				}
				
				
				sum.add(SUM);
			}
			
			double max=0.0;
			
			for(int n=0;n<N-K;n++) {
				if(max<sum.get(n)) {
					max = sum.get(n);
				}
				
			}
			
			System.out.println(max);
			
			
		}

	}