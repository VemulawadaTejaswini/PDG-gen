import java.util.Scanner;

public class Main{

	private static final String UP = "U";
	private static final String DOWN = "D";
	private static final String LEFT = "L";
	private static final String RIGHT = "R";

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int tx = sc.nextInt();
			int ty = sc.nextInt();
			execute(sx, sy, tx, ty);
		};
	}

	private static void execute(int sx,int sy,int tx,int ty) {
		int dx = tx - sx;
		int dy = ty - sy;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < dy ; i++) {
			sb.append(UP);
		}
		for(int i = 0 ; i < dx ; i++) {
			sb.append(RIGHT);
		}
		for(int i = 0 ; i < dy ; i++) {
			sb.append(DOWN);
		}
		for(int i = 0 ; i < dx ; i++) {
			sb.append(LEFT);
		}
		sb.append(LEFT);
		for(int i = 0 ; i < dy ; i++) {
			sb.append(UP);
		}
		sb.append(UP);
		for(int i = 0 ; i < dx ; i++) {
			sb.append(RIGHT);
		}
		sb.append(RIGHT);
		sb.append(DOWN);
		sb.append(RIGHT);
		for(int i = 0 ; i < dy ; i++) {
			sb.append(DOWN);
		}
		sb.append(DOWN);
		for(int i = 0 ; i < dx ; i++) {
			sb.append(LEFT);
		}
		sb.append(LEFT);
		sb.append(UP);
		System.out.println(sb.toString());
	}
}