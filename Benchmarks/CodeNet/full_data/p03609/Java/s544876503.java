import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int t = sc.nextInt();
		
		int ans = Math.max(x - t, 0);
		System.out.println(ans);
	}
}
