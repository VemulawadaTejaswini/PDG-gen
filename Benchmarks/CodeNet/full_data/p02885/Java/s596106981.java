import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		int ans = a - 2*b >0 ? a - 2*b : 0;
		System.out.println(ans);
		in.close();
	}
}
