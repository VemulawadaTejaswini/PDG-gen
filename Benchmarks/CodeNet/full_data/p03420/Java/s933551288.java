import java.util.*;
 
class Main{
	
	public static void main(String args[]){
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
 
		long count=0;
 
		for(int n=K;n<N;n++){
			count += N - n;
			
 
			int t = n + 1;
			while(t<=N){
				int x = (N - n)/t;
				if(x==0) break;
				count += x;
				t++;
			}
		}

		if(K==0) count -= N;
 
		System.out.println(count);
	}
}