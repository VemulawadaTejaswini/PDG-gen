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
		double ans = (Asum / (double)N);
		long bans1,bans2 = 0;
		bans1 = (long)Math.floor(ans);
		bans2 = (long)Math.ceil(ans);
		long Asum1=0,Asum2 = 0;
		for(int i=0;i<N;i++) {
			Asum1 += (long)Math.abs(A[i]-bans1);
		}
		for(int i=0;i<N;i++) {
			Asum2 += (long)Math.abs(A[i]-bans2);
		}
		if(Asum1<Asum2)
			System.out.println(Asum1);
		else
			System.out.println(Asum2);
	}
}