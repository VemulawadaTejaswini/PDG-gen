import java.util.Scanner;

/**
 * https://arc091.contest.atcoder.jp/tasks/arc091_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		long ans = 0;
		for(int a=N; a>0; a--){
			if(a>=K) ans += (N-a);
			for(int b=a-1; b>0; b--){
				if(a%b>=K){
					ans++;
				}
			}
		}		
		System.out.println(ans);
	}

}