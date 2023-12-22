import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(K > (N-1)*(N-2)/2) {
			System.out.println(-1);
			return;
		}
		System.out.println(N*(N-1)/2-K);
		for(int i = 2; i <= N; i++)
			System.out.println(1 + " " + i);
		int M = 0;
		for(int i = 2; i <= N; i++) {
			for(int j = i+1; j <= N; j++) {
				M++;
				if(M > (N-1)*(N-2)/2-K)
					break;
				System.out.println(i + " " + j);
			}
		}
	}

}
