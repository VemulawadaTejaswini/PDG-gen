import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");
		String s = in[0];
		String t = in[1];

		String[] in2 = sc.nextLine().split(" ");
		int a = Integer.valueOf(in2[0]);
		int b = Integer.valueOf(in2[1]);
		String u = sc.nextLine();
		if (s.equals(u)) {
			System.out.println((a - 1) + " " + b);
		} else {
			System.out.println(a + " " + (b - 1));
		}
	}
}
