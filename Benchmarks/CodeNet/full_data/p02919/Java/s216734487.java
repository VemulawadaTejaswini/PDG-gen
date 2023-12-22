import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];
		int A[] = new int[N + 1];
		for(int i = 0 ; i < N ; ++i) {
			P[i] = sc.nextInt();
			A[P[i]] = i + 1;
		}
		TreeSet<Integer> phigh = new TreeSet<>();
		phigh.add(0);
		phigh.add(N + 1);
		phigh.add(A[N]);
		long S = 0;
		//X [i,j]  = P => [i,j] P未満かつP以上が一つ
		for(int n = N - 1; n >= 1 ; --n) {
			int Xi = A[n];
			long y = phigh.higher(Xi);
			long z = N + 1;
			if(y < N + 1) {
				z = phigh.higher((int)y);				
			}
			long x = phigh.lower(Xi);
			long w = 0;
			if(x != 0) {
				w = phigh.lower((int)x);				
			}
			long C = (x - w) * (y - Xi) + (Xi - x) * (z - y);
			S += C * n;
			phigh.add(Xi);
		}
		System.out.println(S);
	}
}
