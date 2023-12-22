import java.util.Scanner;

public class Main {
	static int r = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		int r = 0;
		for(int i = 1; i < N - 1; i++) {
			int min = Math.min(Math.min(p[i - 1], p[i]), p[i + 1]);
			int max = Math.max(Math.max(p[i - 1], p[i]), p[i + 1]);
			if(min < p[i] && p[i] < max) r++;
		}
		System.out.println(r);
	}
}	
