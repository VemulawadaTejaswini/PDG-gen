import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		long cnt = Integer.MAX_VALUE;
		long bcnt = 0;
		long wcnt = 0;
		for(int i = 0;i <= N;i++) {
			String s1 = S.substring(0,i);
			String s2 = S.substring(i, S.length());
			bcnt = s1.chars().filter(ch -> ch == '#').count();
			wcnt = s2.chars().filter(ch -> ch == '.').count();
			cnt = Math.min(cnt, bcnt+wcnt);
		}
		System.out.println(cnt);
	}
}