import java.util.Scanner;

public class Main {
	static int N;
	static int[] A;
	static int min;

	public static void main(String[] args) {
		readInput();

		solve();
	}

	static void solve() {
		
		while(true) {
			int newMin = min;
			for(int i=0; i<N; i++) {
				int a = A[i] % min;
				
				if(a == 0) {
					a = min;
				}
				
				if(newMin > a) {
					newMin = a;
				}
				
				A[i] = a;
			}
			
			if(newMin == min) {
				break;
			}else {
				min = newMin;
			}
		}
		
		System.out.println(min);
	}
	

	static void readInput() {
		try (Scanner sc = new Scanner(System.in)) {
			N = sc.nextInt();

			A = new int[N];
			
			min = Integer.MAX_VALUE;
			
			for(int i = 0; i<N; i++) {
				A[i] = sc.nextInt();
				if(min > A[i]) {
					min = A[i];
				}
			}
		}
	}
}
