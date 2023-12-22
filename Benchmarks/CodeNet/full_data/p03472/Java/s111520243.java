import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int H = sc.nextInt();

		int[] S = new int[N+1];
		int[] T = new int[N+1];

		for(int i = 1 ; i <= N ; i++){
			S[i] = sc.nextInt();
			T[i] = sc.nextInt();
		}

		sc.close();

		Arrays.sort(S);
		Arrays.sort(T);

		long[] U = new long[N+1];

		for(int i = 1 ; i <= N ; i++){
			U[i] = U[i-1] + T[i];
		}

		long tmp = 0;
		long ans = 1000000000;
		for(int i = N ; i >= 0 ; i--){
			tmp = i;

			if((H-(U[N]-U[N-i])) > 0){
				tmp += (H-(U[N]-U[N-i]))/S[N];
				if((H-(U[N]-U[N-i]))%S[N]!=0){
					tmp++;
				}
			}

			ans = Math.min(ans, tmp);

			//System.out.println(i + "回刀を投げて" + tmp);
		}
		System.out.println(ans);

	}
}