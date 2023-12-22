
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		for(int i=1;i<=K;i++){
			long tmp = comb(N-K+1,i)*comb(K-1,i-1);
			tmp %= (long)(Math.pow(10, 9)+7);
			System.out.println(tmp);
		}

	}

	//combination
	static long comb(int n, int r){
		if(r==0)return 1;
		else{
			return comb(n,r-1)*(n-r+1)/r;
		}
	}
}
