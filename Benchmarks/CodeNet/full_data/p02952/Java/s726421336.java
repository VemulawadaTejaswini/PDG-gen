import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(search(N));
	}

	public static int search(int N) {
		int ans = 0;

		for(int n = 1; n <= N; n++) {
			if (Integer.toString(n).length() % 2 == 0) continue;
			ans++;
		}
		return ans;
	}
}
