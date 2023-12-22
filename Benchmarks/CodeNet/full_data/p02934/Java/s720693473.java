import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(stdin.next());
		double A[] = new double[N];
		double sum=0;
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(stdin.next());
		}
		
		for(int i=0;i<N;i++) {
			sum += 1/A[i];
		}
		
		out.println(1/sum);
		
		out.flush();
	}
	
}