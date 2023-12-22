import java.util.Scanner;

public class Main {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n == 0) {
			System.out.println(2);
			return;
		}
		if(n == 1) {
			System.out.println(1);
			return;
		}
		solve(2,1,2);
	}
	static void solve(long l1, long l2, int w) {
		if(w == n) {
			System.out.println(l2 + l1);
			return;
		}
		long li = l2 + l1;
		solve(l2, li, w+1);
	}
}