import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String x = "CODEFESTIVAL2016";
		int ans = 0;
		for(int i = 0 ; i < 16 ; i++) {
			if(s.charAt(i) != x.charAt(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
