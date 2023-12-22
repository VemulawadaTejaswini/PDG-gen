import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = Integer.MIN_VALUE;
		int R = Integer.MAX_VALUE;
		for(int i = 0; i < M; i++) {
			L = Math.max(L, sc.nextInt());
			R = Math.min(R, sc.nextInt());
		}
		sc.close();
		System.out.println(R - L + 1);
	}
}