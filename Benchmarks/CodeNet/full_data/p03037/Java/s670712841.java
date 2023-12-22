import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		int[] ans = new int[N + 1];
		
		for(int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			for(int j = L[i]; j <= R[i]; j++) {
				ans[j]++;
			}
		}
		
		int count = 0;
		
		for(int i = 1; i <= N; i++) {
			if(ans[i] == M) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
