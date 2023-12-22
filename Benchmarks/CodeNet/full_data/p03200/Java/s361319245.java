import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = s.length;
		int black = 0;
		long ans = 0;
		for(int i=n-1;i>=0;i--) {
			if (s[i] == 'B') {
				ans += n-1-black-i;
				black++;
			}
		}
		System.out.println(ans);
	}

}
