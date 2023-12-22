import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double rate = Math.ceil((double) N / 1.08);
		int ans = (int) rate;
		if (Math.floor(ans * 1.08) == N) {
			System.out.println(ans);
		} else {
			System.out.println(":(");
		}
		in.close();
	}
}