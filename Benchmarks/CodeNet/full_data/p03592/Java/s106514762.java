import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Simulate flip processes
	//UPD: Don't always need to take max rows

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int K = input.nextInt();
		System.out.println(Valid(N,M,K)?"Yes":"No");
	}	
	public static boolean Valid(int N,int M,int K) {
		for (int r = 0; r <= N; r++) {
			int numB = r*M;
			for (int c = 0; c <= M; c++) {
				int leftrows = N-r;
				int net = leftrows-r;
				int total = numB+c*net;
				if (total==K) {
					return true;
				}
			}
		}
		return false;
	}
}