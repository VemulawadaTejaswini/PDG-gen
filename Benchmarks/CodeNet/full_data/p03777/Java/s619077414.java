import java.util.Scanner;

/**
 * https://abc056.contest.atcoder.jp/tasks/abc056_a
 */
public class Main {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		String ans;
		ans = a.equals(b) ? "H" : "D";
	
		System.out.println(ans);
 
	}
 
}