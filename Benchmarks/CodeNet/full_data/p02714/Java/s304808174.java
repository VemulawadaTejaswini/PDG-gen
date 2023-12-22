import java.util.Scanner;

public class Main {
	final static char R = 'R';
	final static char G = 'G';
	final static char B = 'B';
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		sc.close();
		long ans = 0L;
		for(int i = 0; i < N; i++) {
			int jj = i + 1;
			for(int j = jj; j < N; j++) {
				int kk = j + 1;
				for(int k = kk; k < N; k++) {
					// System.out.println(S[i]+""+S[j]+""+S[k]+" "+i+"_"+j+"_"+k);
					if(S[i] != S[j] && S[i] != S[k] && S[j] != S[k]
					&& j - i != k - j) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}