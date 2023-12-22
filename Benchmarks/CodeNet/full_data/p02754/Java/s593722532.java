import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = A+B;
		long count = 0L;
		long ans = 0L;

		long aa = 0;
		long bb = 0;
		if (A == 0) {
			System.out.println(0);
		} else if (B == 0) {
			System.out.println(N);
		} else {

			/*
			while (count < N) {
				System.out.println(ans + " "+count);
				if (aa < A) {
					ans++;
					aa++;
				} else if (aa == A) {
					aa = 0;
					bb++;
				} else if (bb < B) {
					bb++;
				} else if (bb == B) {
					bb = 0;
					aa = 0;
				}
				count++;
			}	
			*/
			if (N <= A) {
				System.out.println(N);
			} else if (C >= N) {
				System.out.println(A);
			} else if (N%C==0){
				ans = A * (N/C);
				System.out.println(ans);
			} else {
				ans = A * (N/C);
				//System.out.println("test"+ans);
				if (N-(C*(N/C)) >= A) {
					ans += A;
				} else {
					ans += N-(C*(N/C));
				}
				System.out.println(ans);
			}
			
		}
	}
}