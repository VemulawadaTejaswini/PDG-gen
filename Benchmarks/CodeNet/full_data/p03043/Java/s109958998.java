import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc077/tasks/arc084_b
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();
		
		double ans = 0;
		for(int i=1; i<=N; i++) {
			int score=i;
			double p=1;
			while(score<K) {
				score*=2;
				p/=2;
			}
			ans += p;
		}
		System.out.println(ans/N);		
	}

}
