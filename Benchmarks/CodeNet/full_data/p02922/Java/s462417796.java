import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b / (a - 1);
		int d = b % (a - 1);
		if (d >= 2) {
			System.out.println(c + 1);
		} else {
			System.out.println(c);
		}
	}
}