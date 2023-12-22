
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int NM = N*M/gcd(N,M);
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();

		char[] X = new char[NM];
		for (int i=0;i<NM;i++) {
			X[i] = 'X';
		}

		for (int i=0;i<N;i++) {
			X[i*NM/N] = S[i];
		}

		int ans = NM;
		for (int i=0;i<M;i++) {
			if((X[i*NM/M]!=T[i]) && ((X[i*NM/M])!='X')) {
				ans = -1;
				break;
			}
		}

		System.out.println(ans);

	}


	public static int gcd(int m,int n) {
		int t;
		while (m % n != 0) {
			t = n;
			n = m%n;
			m = t;
		}
		return n;
	}
}