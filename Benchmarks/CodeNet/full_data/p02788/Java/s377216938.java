import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		long A = sc.nextInt();
		int[][] X = new int[N][2];
		for(int i = 0; i < N; i++) {
			X[i][0] = sc.nextInt();
			X[i][1] = sc.nextInt();
		}
		Arrays.sort(X, (x, y) -> x[0] - y[0]);
		long ans = 0;
		int i = 0, temp = 0;
		while(i < N) {
			temp = X[i][0] + D;
			long k = (X[i][1] + A - 1) / A;
			ans += k;
			while(true) {
				i++;
				if(i >= N)
					break;
				if(X[i][1] > temp)
					break;
				if(X[i][1] - A * k > 0) {
					X[i][1] -= A * k;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}