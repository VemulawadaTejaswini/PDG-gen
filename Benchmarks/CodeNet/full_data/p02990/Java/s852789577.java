
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		if(N==K){
			for(int i=0;i<K;i++)System.out.println(1);
			return;
		}

		for(int i=1;i<=K;i++){
			long tmp = comb(N-K+1,i)*comb(K-1,i-1);
			tmp %= (Math.pow(10, 9)+7);
			System.out.println(tmp);
		}

	}

	//combination
	static long comb(int n, int k){
		if(n<k)return 0;
		double tmp = 1;
		for(int i=0;i<k;i++){
			tmp*=(n-i);
			tmp/=(k-i);
		}		
		return (long)tmp;
	}
}
