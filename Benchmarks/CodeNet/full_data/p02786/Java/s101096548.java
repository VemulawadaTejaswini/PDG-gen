
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = Long.parseLong(sc.nextLine());
		Main main = new Main();
		int pow = main.divcount(num, 0);
		double ans = 0;
		for (int i = 0; i <= pow; i++) {
			ans += Math.pow(2, i);
		}
		System.out.println((long)ans);
	}

	public int divcount(long num,int con) {
		if (num > 1) {
			return divcount(num / 2, ++con);
		}
		return con;
	}

}