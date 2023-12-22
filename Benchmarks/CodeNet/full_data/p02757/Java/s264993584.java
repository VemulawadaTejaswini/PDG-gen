import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	int N, P;
	String S;
	long[] c;
	
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		P = sc.nextInt();
		S = sc.next();
		if (P == 2 || P == 5) pis2or5();
		else inv10exists();
	}
	
	void pis2or5() {
		long ans = 0;
		for (int i = 0; i < N; i++) {
			int d = S.charAt(i) - '0';
			if (d%P == 0) ans += i+1;
		}
		System.out.println(ans);
	}
	
	void inv10exists() {
		c = new long[P];
		c[0] = 1;
		long q = 1;
		long s = 0;
		for (int i = 0; i < N; i++) {
			long a = S.charAt(N-i-1) - '0';
			a = (a*q)%P;
			q = (10*q)%P;
			s = (s+a)%P;
			c[(int)s]++;
		}
		long ans = 0;
		for (int i = 0; i < P; i++)
			ans = ans + c[i]*(c[i]-1)/2;
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
