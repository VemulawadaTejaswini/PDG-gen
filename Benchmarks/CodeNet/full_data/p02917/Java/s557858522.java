import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = Integer.parseInt(stdin.next());
		int B[] = new int[N];
		int A[] = new int[N];
		
		for(int i=0;i<N-1;i++) {
			B[i] = Integer.parseInt(stdin.next());
		}
		
		B[N-1] = 100000;
		int sum = B[0];
		for(int i=N-1;i>=1;i--) {
			int max=0;
			for(int j=0;j<=B[i-1];j++) {
				if(B[i-1] >=j && B[i] >= j) {
					max=j;
				}
			}
			sum += max;
		}

		out.println(sum);
			
		out.flush();
	}

}
