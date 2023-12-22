import java.util.*;

public class Main {
	static long[][] comb;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		final long MOD = 1000000007;
		
		int L = 2010;
		comb = new long[L][L];
		for(int i=0; i<L; i++)
			for(int j=0; j<=i; j++)
				comb[i][j] = j==0||i==j ? 1 : (comb[i-1][j]+comb[i-1][j-1])%MOD;
		
		for(int i=1; i<=K; i++)
			System.out.println(divAtoB(K-i, i) * divAtoB(N-K-(i-1), i+1));
		
		sc.close();
	}
	
	static long divAtoB(int a, int b) {
		return a<0 || b<0 ? 0 : comb[a+b-1][b-1];
	}
}