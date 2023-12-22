import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), rt;

		for (int i = n; i >= 1; i--) {
			rt = (int)Math.sqrt(i);
			if (rt * rt == i) {
				System.out.println(i);
				break;
			}
		}
	}

}