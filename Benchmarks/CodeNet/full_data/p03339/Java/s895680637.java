import java.util.Scanner;

public class Main {
	static int N;
	static String S;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.next();
		
		int leader = 0;
		int ans = Integer.MAX_VALUE;
		
		for (int a = 0; a < N; a++) {
			int count = 0;
			
			//ArrayList 特定の文字が何文字か
			
			ans = Math.min(ans, count);
			leader++;
		}
		System.out.println(ans);
	}
}