import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int lim = (x % 100 - 1) / 5 + 1;
		
		int ans = 0;
		if (x / 100 >= lim) {
			ans = 1;
		}
		
		System.out.println(ans);
	}
}
