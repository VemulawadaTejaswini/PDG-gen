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

		cnt = (float)pat / type * N * (M-1);
		System.out.println(cnt);
		
	}

}