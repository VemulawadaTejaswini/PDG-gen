import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[] cnt = new int[N+1];
		for(int i = 0;i < N-1;i++) {
			cnt[i+1] = cnt[i] + (S.substring(i,i+2).equals("AC") ? 1 : 0);
		}
		String SLastSub = String.valueOf(S.charAt(N-2)+S.charAt(N-1));
		cnt[N] = cnt[N-1] + (SLastSub.equals("AC") ? 1 : 0);
		for(int i = 0;i < Q;i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			System.out.println(cnt[R-1]-cnt[L-1]);
		}
		sc.close();
	}
}