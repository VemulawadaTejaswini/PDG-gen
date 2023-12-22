import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = Integer.parseInt(scan.next());
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		
		for(int i = 0; i < N; ++i) {
			int in = Integer.parseInt(scan.next());
			A[i] = in;
		}
		
		for(int i = 0; i < N; ++i) {
			int in = Integer.parseInt(scan.next());
			B[i] = in;
		}
		
		for(int i = 0; i < (N - 1); ++i) {
			int in = Integer.parseInt(scan.next());
			C[i] = in;
		}

		
		int sum = 0;
		
		for(int i = 0; i < N; ++i) {
			sum += B[A[i] - 1];
			
			if(i != 0) {
				sum += C[A[i - 1] - 1];
			}
		}
		
		pw.print(sum);
		
		scan.close();
		pw.close();
	}
}