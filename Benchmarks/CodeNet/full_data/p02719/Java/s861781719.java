import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = 0, k = 0 ,ans = 0, a = 0;
		n = sc.nextLong();
		k = sc.nextLong();
		a = n % k;
		System.out.print(ans = Math.min(a, k - a));
	}
}
