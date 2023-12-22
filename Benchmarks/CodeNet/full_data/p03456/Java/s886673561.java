import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String a = sc.next();
		String b = sc.next();
		int c = Integer.valueOf(a + b);
		String ans = "Yes";
		
		if (Math.sqrt(c) % 1 != 0) {
			ans = "No";
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
