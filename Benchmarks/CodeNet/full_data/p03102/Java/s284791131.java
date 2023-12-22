import java.util.Scanner;

public class Main{
	static long mod = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), C = sc.nextInt();
		int[] B = new int[M];
		for(int i = 0; i < M; i++) B[i] = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int time = 0;
			for(int j = 0; j < M; j++) {
				int A = sc.nextInt();
				time += A * B[j];
			}
			if(time + C > 0) ans++;
		}
		System.out.println(ans);
	}
}
