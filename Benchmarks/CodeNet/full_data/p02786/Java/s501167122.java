import java.util.Scanner;

public class Main {

	public static long cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();

		fight(H);
		System.out.println(cnt);

		sc.close();
	}

	public static void fight(long H) {

		if (H == 1) {
			cnt++;
		} else {
			cnt++;
			fight((long) Math.floor(H / 2));
			fight((long) Math.floor(H / 2));
		}
	}
}
