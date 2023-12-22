import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int sx = Integer.parseInt(scanner.next());
	    int sy = Integer.parseInt(scanner.next());
	    int tx = Integer.parseInt(scanner.next());
	    int ty = Integer.parseInt(scanner.next());
	    out1(sx, sy, tx, ty);

	}

	public static void out1(int sx, int sy, int tx, int ty) {
		int tsx = tx - sx;
		int tsy = ty - sy;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tsx; i++) {
		    sb.append("R");
		}
		for (int i = 0; i < tsy; i++) {
		    sb.append("U");
		}
		for (int i = 0; i < tsx; i++) {
		    sb.append("L");
		}

		for (int i = 0; i < tsy + 1; i++) {
		    sb.append("D");
		}
		for (int i = 0; i < tsx + 1; i++) {
		    sb.append("R");
		}
		for (int i = 0; i < tsy + 1; i++) {
		    sb.append("U");
		}
		sb.append("L");
		sb.append("U");
		for (int i = 0; i < tsx + 1; i++) {
		    sb.append("L");
		}
		for (int i = 0; i < tsy + 1; i++) {
		    sb.append("D");
		}
		sb.append("R");
		System.out.print(sb.toString());
	}
}