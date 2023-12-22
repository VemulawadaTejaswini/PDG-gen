import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] str = new String[h];
		for (int i = 0; i < h; i++) {
			str[i] = "#" + sc.next() + "#";
		}
		String frame = "";
		for (int i = 0; i < str[0].length(); i++) {
			frame += "#";
		}

		sb.append(frame + "\n");
		for (int i = 0; i < h; i++) {
			sb.append(str[i] + "\n");
		}
		sb.append(frame + "\n");
		System.out.print(sb);
	}
}
