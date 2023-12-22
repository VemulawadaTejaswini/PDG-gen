import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ans = 0;
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int form = scanner.nextInt();
			int to = scanner.nextInt();
			ans += to-form+1;
		}
		
		System.out.println(ans);
		scanner.close();
	}
	

}
