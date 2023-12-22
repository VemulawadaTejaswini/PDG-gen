import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int dx = Integer.parseInt(inputs[2]) - Integer.parseInt(inputs[0]);
		int dy = Integer.parseInt(inputs[3]) - Integer.parseInt(inputs[1]);
		StringBuilder sb = new StringBuilder();
		appendChars(sb, 'D', 1);
		appendChars(sb, 'R', dx + 1);
		appendChars(sb, 'U', dy + 1);
		appendChars(sb, 'L', dx + 1);
		appendChars(sb, 'D', dy);
		appendChars(sb, 'R', dx);
		appendChars(sb, 'U', dy + 1);
		appendChars(sb, 'L', dx + 1);
		appendChars(sb, 'D', dy + 1);
		appendChars(sb, 'R', 1);
		System.out.println(sb);
	}

	private static void appendChars(StringBuilder sb, char c, int times) {
		for (int i = 0; i < times; i++) sb.append(c);
	}
}
