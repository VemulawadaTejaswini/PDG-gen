import java.util.Scanner;

/**
 * https://abc060.contest.atcoder.jp/tasks/abc060_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		String ans = "NO";
		if( (A%2==0 && B%2==0 && C%2==0) || 
			(A%2==1 && B%2==0 && C%2==1) || 	
			(A%2==0 && B%2==1 && C%2==1) || 
			(A%2==1 && B%2==1 && C%2==0))
			ans = "YES";
		System.out.println(ans);

	}

}