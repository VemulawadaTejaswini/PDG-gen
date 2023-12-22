import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];
		for(int i = 0;i < N;++i)
			H[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		double ansDiff = Math.abs(A - (T - 0.006 * H[0]));
		for(int i = 1;i < N;++i) {
			double cap = Math.abs(A - (T - 0.006 * H[i]));
			if(cap < ansDiff) {
				ansDiff = cap;
				ans = i;
			}
		}
		
		System.out.println((ans+1));
	}
}
