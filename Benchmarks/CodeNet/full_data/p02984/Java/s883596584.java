import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		long total = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt()*2;
			if(i % 2 == 0)
				total += A[i];
			else
				total -= A[i];
		}
		int D = (int)total/2;
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < N; i++) {
			ans.append(D);
			if(i != N-1)
				ans.append(" ");
			D = A[i] - D;
		}
		System.out.println(ans);

	}

}
