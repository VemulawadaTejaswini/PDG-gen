import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(stdin.next());
		int k= Integer.parseInt(stdin.next());
		int K[] = new int[N];

		int Q = stdin.nextInt();
		int A[] = new int[Q];
		for(int i=0;i<Q;i++) {
			A[i] = Integer.parseInt(stdin.next());
		}
		for(int i=0;i<N;i++) {
			K[i] = k-Q;
		}
		
		for(int i=0;i<Q;i++) {
			K[A[i]-1] += 1;
		}
		
		for(int i=0;i<N;i++) {
			if(K[i] <=0) {
				out.println("No");
			}
			else {
				out.println("Yes");
			}
		}
		out.flush();
	}
	
}