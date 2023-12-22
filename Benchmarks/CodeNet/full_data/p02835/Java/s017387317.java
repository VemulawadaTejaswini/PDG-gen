import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		String ans;
		if ((a + b + c) < 22) {
			ans = "win";
		} else {
			ans = "bust";
		}
		System.out.println(ans);
	}

}
