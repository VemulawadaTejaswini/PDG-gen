import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = 1 << sc.nextInt();
		int K = sc.nextInt();
		if(M == 2 && K == 0) {
			System.out.println("0 0 1 1");
			return;
		}
		if(K >= M || M == 2) {
			System.out.println(-1);
			return;
		}
		StringBuilder ans = new StringBuilder();
		StringBuilder b = new StringBuilder();
		for(int i = 0; i < M; i++) {
			if(i == K)
				continue;
			b.append(i+" ");
		}
		ans.append(b).append(K).append(b.reverse()).append(" " + K);
		System.out.println(ans);
	}

}