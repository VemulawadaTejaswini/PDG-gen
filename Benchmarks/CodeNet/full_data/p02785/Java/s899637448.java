import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Long> HP = new ArrayList<>();

		for(int i=0; i<N; i++) {
			HP.add(sc.nextLong());
		}
		Collections.sort(HP);
		Collections.reverse(HP);
		
		if(N<K) {
			System.out.println(0);
			return;
		}
		long answer = 0;
		
		for(int i=K; i<N; i++) {
			answer += HP.get(i);
		}
		System.out.println(answer);
	}		
}