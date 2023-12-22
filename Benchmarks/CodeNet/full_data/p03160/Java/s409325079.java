import java.util.Scanner;

public class Main {

	static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] h = new int[N + 1];
		int[] d = new int[N + 1];
		for (int i=1; i <= N; i++) {
			h[i] = in.nextInt();
			d[i] = INF;
		}
		d[1] = 0;
		d[2] = Math.abs(h[2] - h[1]);
		for(int i=3; i<=N; i++) {
			d[i] = Math.min(d[i-1] + Math.abs(h[i-1]-h[i]), d[i-2] + Math.abs(h[i-2]-h[i])); 
		}
		System.out.println(d[N]);
	}
}