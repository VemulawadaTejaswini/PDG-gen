import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long S = sc.nextLong();

		long[] out = new long[6];

		out[0] = 0;
		out[1] = 0;

		out[2] = 0;
		out[3] = 1;

		out[4] = S;
		out[5] = 0;

		System.out.println(
						out[0] + " " +
						out[1] + " " +
						out[2] + " " +
						out[3] + " " +
						out[4] + " " +
						out[5] + " ");
	}
}