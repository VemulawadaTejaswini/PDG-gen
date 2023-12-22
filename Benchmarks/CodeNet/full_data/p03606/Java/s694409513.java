import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		for(int i = 0; i < n; i++){
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			ans += r - l + 1;
		}
		System.out.println(ans);
	}
}