import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int B[] = new int[M];
		for(int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		int A[][] = new int[N][M];
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int temp = C;
			for(int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
				temp = temp + A[i][j] * B[j];
				//System.out.println(temp);
			}
			//System.out.println(temp + ":");
			if(temp > 0) ans++;
		}
		System.out.println(ans);
	}
}
