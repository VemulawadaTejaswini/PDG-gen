import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();

		double cnt = 0;
		long type = (long)Math.pow(N,M);

		long pat = 0;
		if(D==0) pat = N;
		else pat = 2*(N-D);
		cnt = pat * N * (M-1);

		for(int m=0;m<M;m++){
			cnt /= (float)N;
		}
		System.out.println((double)(M-D-1)/N);
		
	}

}