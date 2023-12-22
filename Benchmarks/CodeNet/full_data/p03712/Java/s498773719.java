import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(),w = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append(rep("#",w+2));
		sb.append("\n");
		for (int i = 0; i < h; i++) {
			sb.append("#");
			sb.append(sc.next());
			sb.append("#\n");
		}
		sb.append(rep("#",w+2));
		sb.append("\n");
		System.out.println(new String(sb));
		sc.close();
	}

	public static String rep(String s,int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(s);
		}
		return new String(sb);
	}
}