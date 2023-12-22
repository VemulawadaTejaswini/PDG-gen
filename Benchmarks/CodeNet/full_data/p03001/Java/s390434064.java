import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long W = in.nextLong();
		long H = in.nextLong();
		long x = in.nextLong();
		long y = in.nextLong();
		System.out.println(String.format("%.9f", (double) W * H / 2));
		System.out.println(x * 2 == W && y * 2 == H ? 1 : 0);
		in.close();
	}

}