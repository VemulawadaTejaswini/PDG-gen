import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long ans = 1;

		if(N%M==0){
			ans = N/M;
		}
		else{
			for(long k=1;k<M+1;k++){
				if(M%k==0){
					if(k*N>M) break;
					ans = k;
				}
			}
		}

		System.out.println(ans);

	}
}