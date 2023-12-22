import java.util.Scanner;

/**
 * https://abc056.contest.atcoder.jp/tasks/arc070_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		sc.close();
		
		long current = 0;
		long ans = 0;
		while(current<X){
			ans++;
			current += ans;
		}
		System.out.println(ans);

	}

}
