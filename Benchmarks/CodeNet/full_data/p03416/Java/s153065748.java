import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		for(int i = a ; i <= b ; i++) {
			String s = String.valueOf(i);
			String c = "" + s.charAt(0) + s.charAt(1);
			String d = "" + s.charAt(4) + s.charAt(3);
			if(Integer.valueOf(c) == Integer.valueOf(d)) {
				ans++;
			}
//			if(s.substring(0, 2).equals(s.substring(3))) {
//				ans++;
//			}
		}
		System.out.println(ans);
	}
}
