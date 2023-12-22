import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long ans = (x / 11) * 2;
		ans += (x - ans * 11) <= 6 ? 1 : 2;
		System.out.println(ans);
		in.close();
	}
}