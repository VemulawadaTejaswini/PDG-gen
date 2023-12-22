import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		 
		int A[] = new int[N];
		
		int ans = N / (K - 1) == 0 ?  N / (K - 1) + 1 : N / (K - 1);
		System.out.println(ans);
	}
}
