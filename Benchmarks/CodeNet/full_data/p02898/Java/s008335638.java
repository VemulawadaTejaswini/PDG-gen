import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a >= k) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
