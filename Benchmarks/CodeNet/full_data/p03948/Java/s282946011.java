import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();

		int maxDiff = 0;
		int max = 0;
		for(int i=N-1; i>=0; i--) {
			max = Math.max(max, A[i]);
			maxDiff = Math.max(maxDiff, max-A[i]);
		}

		int ans = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int i=N-1; i>=0; i--) {
			set.add(A[i]);
			if(set.contains(A[i]+maxDiff))
				ans++;
		}
		System.out.println(ans);

		sc.close();
	}

}