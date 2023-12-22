import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.next());
		Integer[] A = new Integer[N + 1];
		Integer[] B = new Integer[N + 1];
		Integer[] C = new Integer[N + 1];
		
		int sum = 0;
		
		for(int i = 1; i <= N; ++i) {
			int in = Integer.parseInt(scan.next());
			A[i] = in;
		}
		
		for(int i = 1; i <= N; ++i) {
			int in = Integer.parseInt(scan.next());
			B[A[i]] = in;
		}
		
		for(int i = 1; i <= N - 1; ++i) {
			int in = Integer.parseInt(scan.next());
			C[A[i]] = in;
		}
		
		scan.close();
		
		for(int i = 1; i <= N - 1; ++i) {
			sum += B[A[i]];
			
			if (i != N) {
				sum += C[A[i]];
			}
		}
		
        System.out.println(sum);
	}
}