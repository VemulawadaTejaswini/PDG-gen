import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();

		long count = 0;

		long val;
		for(long t = K+1; t<=N;t++){
			val = N/t;
			count += val * (t-K);
			long v2 = N - (val*t + K -1);
			if(v2>0) count += v2;
		}

		if(K==0) count -= N;
		System.out.println(count);
	}


}