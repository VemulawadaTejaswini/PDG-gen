import java.util.Scanner;

public class Main{
	static long mod = (long)10e9+7;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];
		for(int i = 0; i < N; i++) V[i] = sc.nextInt();
		for(int i = 0; i < N; i++) C[i] = sc.nextInt();

		int ans = 0;
		for(int i = 0; i < N; i++) {
			ans += Math.max(0, V[i] - C[i]);
		}
		System.out.println(ans);
	}
}