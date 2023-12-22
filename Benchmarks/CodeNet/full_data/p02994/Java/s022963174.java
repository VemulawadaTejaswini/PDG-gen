
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int ans = 0;
		if(0 <= l) {
			for(int i = 1; i < n; i++) {
				ans += l + i;
			}
		} else if(-n + 1 <= l) {
			for(int i = 0; i < n; i++) {
				ans += l + i;
			}
		} else {
			for(int i = 0; i < n - 1; i++) {
				ans += l + i;
			}
		}
		System.out.println(ans);

	}

}
