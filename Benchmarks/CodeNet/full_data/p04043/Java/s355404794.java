import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		if (sc.nextInt() * sc.nextInt() * sc.nextInt() == 175) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}
}
