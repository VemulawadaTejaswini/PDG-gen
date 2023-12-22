
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static long res = 0;

	public static void main(String[] args) throws Exception {

		int n = sc.nextInt();
		System.out.println(helper(n));

	}

	Set<Long> s = new HashSet<Long>();

	private static int helper(int n) {
		// TODO Auto-generated method stub
		while(n%2==0)
			n=n*5/10;
		while(n%5==0)
			n=n*2/10;
		return sum(n);
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		int res = 0;
		while (n != 0) {
			res += n % 10;
			n = n / 10;
		}
		return res;
	}

}