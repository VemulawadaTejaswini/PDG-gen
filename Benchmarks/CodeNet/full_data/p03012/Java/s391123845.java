import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		for(int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
		}
		int result = 0;
		for(int T = 1; T < N; T++) {
			int S1 = 0;
			int S2 = 0;
			for(int i = 0; i < N; i++) {
				if(i <= T - 1) {
					S1 += W[i];
				}else {
					S2 += W[i];
				}
			}
			if(T == 1) {
				result = Math.abs(S2 - S1);
			}
			result = Math.min(result, Math.abs(S2 - S1));
		}
		sc.close();
		System.out.println(result);
	}
}