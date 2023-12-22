import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String ans = "";
		while(n >= k) {
			int mod = n % k;
			ans = mod + ans;
			n = n/k;
		}
		ans = n + ans;
		System.out.println(ans.length());

		sc.close();
	}
}