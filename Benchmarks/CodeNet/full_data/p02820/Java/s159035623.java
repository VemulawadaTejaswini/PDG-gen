import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		StringBuilder T = new StringBuilder(sc.next());
		HashMap<Integer, Integer> score = new HashMap<>();
		score.put((int)'s', R);
		score.put((int)'r', P);
		score.put((int)'p', S);
		long ans = 0;
		for(int i = 0; i < K; i++) {
			ans += score.get((int)T.charAt(i));
			for(int j = i+K; j < N; j+=K) {
				if(T.charAt(j) != T.charAt(j-K))
					ans += score.get((int)T.charAt(j));
				else
					T.setCharAt(j, 'x');
			}
		}
		System.out.println(ans);

	}

}