import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int N = Integer.parseInt(spl[0]);
		int K = Integer.parseInt(spl[1]);
		sc.close();
		for(int i = 1;i <= K;i++){
			System.out.println((combination(N-K+1,i) * combination(K-1,i-1)) % (1_000_000_000 + 7));
		}
	}

	private static long combination(int n,int k){
		if(k > n){
			return 0;
		}
		if(k < 1 || n == k){
			return 1;
		}
		if(k == 1){
			return n;
		}
		if(k > n - k){
			k = n - k;
		}
		System.out.println("k = " + k);
		long[] NK = new long[k];
		long[] K = new long[k];
		NK[0] = n;
		K[0] = 1;
		for(int i = 1;i < k;i++){
			NK[i] = NK[i-1] * (n - i);
			K[i] = K[i-1] * (i + 1);
		}
		return NK[k-1]/K[k-1];
	}
}