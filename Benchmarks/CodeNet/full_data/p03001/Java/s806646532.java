import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long w = sc.nextInt();
		long h = sc.nextInt();
		long x = sc.nextInt();
		long y = sc.nextInt();
		if (x * 2 == w && y * 2 == h) {
			System.out.println(w * h / 2 + " " + 1);
		} else {
			System.out.println(w * h / 2 + " " + 0);
		}
	}
}
