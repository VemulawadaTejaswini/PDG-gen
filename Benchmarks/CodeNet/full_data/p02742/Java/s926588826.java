import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long h = sc.nextLong();
		long w = sc.nextLong();

		double total = (h*w);

		long ans = (long) Math.floor(total/2.0);



		System.out.println(ans);

	}
}
