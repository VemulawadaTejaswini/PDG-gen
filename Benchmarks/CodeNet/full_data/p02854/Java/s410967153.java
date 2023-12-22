
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A[] = new int[N];
		double interval[] = new double[N-1];
		double length=0;
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
			if(i==0) interval[i] = A[i];
			else if(i!=N-1) interval[i] = interval[i-1] + A[i];
			length += A[i];
		}
		for(int i=0; i<N-1;i++) {
			interval[i] -= length/2;
			if(interval[i]<0) {
				interval[i] = -interval[i];
			}
		}
		Arrays.sort(interval);
		
		double result = interval[0] * 2;
		
		System.out.println(result);
	}
}