import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		sc.close();
		long ans = (long)Math.pow(n / k, 3);
		if(k % 2 == 0) {
			ans += (long)Math.pow((n + k / 2) / k, 3);
		}
		System.out.println(ans);
	}

}
