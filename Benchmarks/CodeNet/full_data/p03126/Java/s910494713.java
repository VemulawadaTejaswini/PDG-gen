import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K[] = new int[N];
		int A[][] = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				A[i][j] = 0;
			}
		}
		for(int i = 0; i < N; i++) {
			K[i] = sc.nextInt();
			for(int j = 0; j < K[i]; j++) {
				int temp = sc.nextInt() - 1;
				A[i][temp] = 1;
				//System.out.println(i + ":" + temp);
			}
		}
		
		int flag[] = new int[M];
		for(int i = 0; i < M; i++) {
				flag[i] = 1;
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(A[i][j] != 1) {
					//System.out.println(i + " : " + j);
					flag[j] = 0;
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i < M; i++) {
			if(flag[i] == 1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
