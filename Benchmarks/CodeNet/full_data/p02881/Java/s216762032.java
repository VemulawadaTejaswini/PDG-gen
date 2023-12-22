import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ret = N - 1;
		for(long A = 1 ; A * A <= N ; ++A){
			if(N % A == 0){
				long B = N / A;
				long move = (B - 1) + (A - 1);
				ret = Math.min(ret, move);
			}
		}
		System.out.println(ret);
	}
}
