import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans  = 0;
		for(long i = 1; i <= n; i++) {
			long temp = 0;
			char[] c = String.valueOf(i).toCharArray();
			for(int j = 0; j < c.length; j++) {
				temp += c[j]-'0';
			}
			ans = Math.max(ans,temp);
		}
		System.out.println(ans);
	}
}