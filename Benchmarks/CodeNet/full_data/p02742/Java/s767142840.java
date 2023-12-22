import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		long v = h * w;
		if (v % 2 == 0) {
			System.out.println(v / 2);
		} else {
			System.out.println((v / 2) + 1);
		}
		sc.close();
	}
}
