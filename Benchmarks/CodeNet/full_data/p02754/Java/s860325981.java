import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		if(A+B==0) {
			System.out.println(0);
		} else {
			long it = N/(A+B);
			System.out.println(it*A+Math.min(A, N%(A+B)));
		}

		sc.close();
	}
}
