import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		int dx = tx - sx;
		int dy = ty - sy;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < dx ; i++) sb.append("R");
		for(int i = 0 ; i < dy ; i++) sb.append("U");
		for(int i = 0 ; i < dx ; i++) sb.append("L");
		for(int i = 0 ; i < dy ; i++) sb.append("D");
		sb.append("D");
		for(int i = 0 ; i < dx + 1 ; i++) sb.append("R");
		for(int i = 0 ; i < dy + 1 ; i++) sb.append("U");
		sb.append("L");
		sb.append("U");
		for(int i = 0 ; i < dx + 1 ; i++) sb.append("L");
		for(int i = 0 ; i < dy + 1 ; i++) sb.append("D");
		sb.append("R");
		System.out.println(sb.toString());
	}
}
