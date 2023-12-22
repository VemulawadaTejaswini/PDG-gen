import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;

		for(int i = 1; i <= n; i++) {
			int sum = 0;
			String s = String.valueOf(i);
			for(int j = 0; j < s.length(); j++) {
				sum += Integer.parseInt(s.substring(j,j+1));
			}
			if(sum <= b && sum >= a) ans += i;
		}

		System.out.println(ans);

		sc.close();
	}
}