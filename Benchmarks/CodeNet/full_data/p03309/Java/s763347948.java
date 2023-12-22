import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long Asum = 0;
		long[] A = new long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextLong()-((long)i+1);
			Asum += A[i];
		}
		long bans = (long)Math.floor(Asum / (double)N);
		Asum = 0;
		for(int i=0;i<N;i++) {
			Asum += Math.abs(A[i]-bans);
		}
		System.out.println(Asum);
	}
}
