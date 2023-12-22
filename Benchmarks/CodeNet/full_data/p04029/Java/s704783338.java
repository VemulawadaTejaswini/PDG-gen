import java.util.Scanner;

/**
 * https://abc043.contest.atcoder.jp/tasks/abc043_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i=1; i<=N; i++){
			ans += i;
		}
		System.out.println(ans);
	}

}