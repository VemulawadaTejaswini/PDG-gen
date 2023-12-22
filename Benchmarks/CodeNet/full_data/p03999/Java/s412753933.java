import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		long ans = 0;
		for(int mask = 0 ; mask < 1<<(n - 1) ; mask++) {
			String temp = s.charAt(0)  + "";
			for(int i = 0 ; i < n - 1 ; i++) {
				if((mask&(1<<i)) >= 1) {
					temp += "+" + s.charAt(i + 1);
				} else {
					temp += s.charAt(i + 1);
				}
			}
			String[] split = temp.split("\\+");
			for(int i = 0 ; i < split.length ; i++) {
				ans += Long.valueOf(split[i]);
			}
		}
		System.out.println(ans);
	}
}
