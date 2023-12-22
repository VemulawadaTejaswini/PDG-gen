import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(N % 2 != K % 2 || N-2 > K || K >= N*(N-1)/2-4) {
			System.out.println(-1);
			return;
		}
		if(N == 2) {
			System.out.println(1 + " " + 2);
			return;
		}
		for(int i = 1; i < N; i++)
			System.out.println(i + " " + (i+1));
		K -= N - 2;
		LOOP:for(int i = 1; i < N-1; i++) {
			for(int j = 2; j < N-i-1; j++) {
				System.out.println(i + " " + (i+j));
				K--;
				if(K == 0)
					break LOOP;
			}
		}
		
	}

}