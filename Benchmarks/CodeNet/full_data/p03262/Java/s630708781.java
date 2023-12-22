import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		int ans = Math.abs(x-Integer.parseInt(sc.next()));
		for (int i=0; i<n-1; i++){
			ans = gcd(ans, Math.abs(x-Integer.parseInt(sc.next())));
		}
		System.out.println(ans);
	}

//	public static int gcd(int a,int b) {
//		return a%b==0?b:gcd(b,a%b);
//	}

	public static int gcd(int num1, int num2) {
		int x = Math.max(num1, num2);
		int y = Math.min(num1, num2);

		while (y != 0) {
			int tmp = x;
			x = y;
			y = tmp%y;
		}
		return x;
	}
}
