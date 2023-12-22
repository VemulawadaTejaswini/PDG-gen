import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int d = in.nextInt();
		int a = in.nextInt();
		in.close();
		int ans = a;
		for(int i = 0; i < 10; i++) {
			ans = ans * r - d;
			System.out.println(ans);
		}
	}
}