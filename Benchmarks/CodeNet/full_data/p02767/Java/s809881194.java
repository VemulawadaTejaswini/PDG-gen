import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		sc.close();
		
		long sumX =0;
		
		for(int i = 0; i < N; i++) {
			sumX += X[i];
		}
		
		double avg = (double)sumX / N;
		
		long p1 = (long)Math.floor(avg);
		long p2 = (long)Math.ceil(avg);
		
		long ans1 = 0, ans2 = 0;
		
		for(int i = 0; i < N; i++) {
			ans1 += (long)Math.pow(X[i] - p1, 2);
			ans2 += (long)Math.pow(X[i] - p2, 2);
		}
		
		System.out.println(Math.min(ans1, ans2));
		

	}
}


