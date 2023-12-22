import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long X = sc.nextLong();
		long N = 0;
		
		if(calc(A, B, 1) <= X){
			N = 1;
			while(calc(A, B, N * 10) <= X){
				N *= 10;
			}
			N = (X - B * (long)(String.valueOf(N).length())) / A;
		}
		System.out.println(N);
	}


	public static long calc(long A, long B, long N){
		return A * N + B * (long)(String.valueOf(N).length());
	}
}
