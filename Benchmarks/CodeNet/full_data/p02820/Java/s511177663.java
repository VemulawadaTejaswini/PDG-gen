import java.util.*;

class Main {
	Scanner sc;
	int N, K, R, S, P;
	String T;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		R = sc.nextInt();
		S = sc.nextInt();
		P = sc.nextInt();
		T = sc.next();
		
		final char IV = (char)0;
		int sc = 0;
		for (int i = 0; i < K; i++) {
			char last = IV;
			for (int r = 0; r < N/K+1; r++) {
				int n = i + r * K;
				if (n >= N) break;
				char c = T.charAt(n);
				if (c == last) {
					last = IV;
				} else {
					switch (c) {
					case 'r':
						sc += P;
						break;
					case 's':
						sc += R;
						break;
					case 'p':
						sc += S;
						break;
					default:
					}
					last = c;
				}
			}
		}
		System.out.println(sc);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}