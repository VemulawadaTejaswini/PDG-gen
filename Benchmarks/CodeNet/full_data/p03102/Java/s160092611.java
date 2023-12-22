import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		int[] map = new int[M];
		for (int i = 0; i < M; i++) {
			map[i] = sc.nextInt();
		}
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < M; j++) {
				int a = sc.nextInt();
				sum += a*map[j];
			}
			
			if (sum + C > 0) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
