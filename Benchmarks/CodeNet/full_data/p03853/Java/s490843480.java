
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < H; i++) {
			String S = sc.next();
			sb.append(S+"\n");
			sb.append(S+"\n");
		}

		System.out.print(sb.toString());


	}

}
