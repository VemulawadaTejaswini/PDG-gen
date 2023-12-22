import java.util.Scanner;

/**
 * https://abc062.contest.atcoder.jp/tasks/abc062_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		int gx = getGroup(x);
		int gy = getGroup(y);
		
		String ans = gx==gy ? "Yes" : "No";
		System.out.println(ans);

	}

	private static int getGroup(int n) {
		if(n==2) return 1;
		if(n==4 || n==6 || n==9 || n==11) return 2;
		else return 3;
	}

}