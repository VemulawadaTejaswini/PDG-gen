import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		int ans = 0;
		while(i <= n) {
			String num = Integer.toString(i);
			if(num.length() % 2 == 1) {
				ans++;
			}
			i++;
		}
		System.out.println(ans);
	}
}
