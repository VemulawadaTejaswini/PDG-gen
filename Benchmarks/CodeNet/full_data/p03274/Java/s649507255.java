import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[]S = new int[N+1];

		for(int i = 0 ; i < N ; i++){
			S[i] = sc.nextInt();
		}
		sc.close();

		int tmp = 2000000000;
		for(int i = 0 ; i <= N-K ; i++){
			int xl = S[i];
			int xr = S[i+K-1];


			int a = Math.abs(xr) + Math.abs(xr-xl);
			int b = Math.abs(xl) + Math.abs(xl-xr);

			if(tmp > Math.min(a, b)){
				tmp = Math.min(a, b);
			}
		}
		System.out.println(tmp);
	}
}
