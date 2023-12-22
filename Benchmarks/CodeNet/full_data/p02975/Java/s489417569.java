import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			res ^= m;
		}
		
		String ans = (res == 0) ? "Yes" : "No";
		
		System.out.println(ans);
		sc.close();
	}

}