import java.util.Scanner;


public class Main {
	static int N,K;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
			 K = sc.nextInt();
		  sc.close();

		  //bを固定してaの数を求める
		  int acount = 0;

		  if(K == 0){
			  acount = N*N;
		  }
		  else{
		  for(int i = K+1 ; i < N+1 ; i++){
			  acount += (i-K) * N/i;
			  if(N%i >= K){
				  acount += ((N%i)-K+1);
			  }
		  }
		  }
		  System.out.println(acount);

	}
}
