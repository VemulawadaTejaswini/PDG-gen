import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong(), y = sc.nextLong();
		sc.close();
		long ans= 0;
		ans = (long)(Math.log((double) y / (double)x) / Math.log(2));
		ans += 1;
		System.out.println(ans);
	}

}
