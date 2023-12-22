import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		int ans = 2*n;
		for(int i = 0; i < n; i++) {
			if(s2.startsWith(s1.substring(i))) {
				ans -= (n-i);
				break;
			}
		}
		System.out.println(ans);
	}
}