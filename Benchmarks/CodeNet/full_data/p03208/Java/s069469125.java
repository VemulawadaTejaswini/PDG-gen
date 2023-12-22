import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int[] h = new int[N];
		for(int i = 0; i < N; i++) h[i] = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		Arrays.sort(h);
		for(int i = 0; i + K - 1 < N; i++) ans = Math.min(ans, h[i + K - 1] - h[i]);
		System.out.println(ans);
	}
}