import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long L[] = new long[N+1];
		L[0] = 2; L[1] = 1;
		long res = solve(N,L);
		System.out.println(res);
	}

	private static long solve(int N, long[] L) {
		if(L[N]!=0)return L[N];
		else return L[N] = solve(N-1,L)+solve(N-2,L);
	}

}