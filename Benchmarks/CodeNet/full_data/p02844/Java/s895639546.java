import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		for(int i = 0; i < 1000; i++) {
			String pass = String.format("%03d", i);
			int c = 0;
			for(int j = 0; j < n; j++) {
				if(s.charAt(j) == pass.charAt(c))c++;
				if(c == 3) {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
