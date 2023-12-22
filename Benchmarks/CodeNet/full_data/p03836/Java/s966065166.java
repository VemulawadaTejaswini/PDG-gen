import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int sx = Integer.parseInt(sc.next());
		int sy = Integer.parseInt(sc.next());
		int tx = Integer.parseInt(sc.next());
		int ty = Integer.parseInt(sc.next());
		int rsx = sx + 1;
		int rtx = tx + 1;
		int lsx = sx - 1;
		int ltx = tx - 1;
		int usy = sy + 1;
		int uty = ty + 1;
		int lsy = sy - 1;
		int lty = ty - 1;
		out.print("R");
		int rh = ty - sy;
		int rw = ltx - rsx;
		while (rw > 0) {
			out.print("R");
			rw--;
		}
		while (rh > 0) {
			out.print("U");
			rh--;
		}
		out.print("R");
		out.print("U");
		int uh = ty - sy;
		int uw = tx - sx;
		while (uw > 0) {
			out.print("L");
			uw--;
		}
		while (uh > 0) {
			out.print("D");
			uh--;
		}
		out.print("D");
		out.print("LDD");
		int lh = ty - (sy - 2);
		int lw = rtx - lsx;
		while (lw > 0) {
			out.print("R");
			lw--;
		}
		while (lh > 0) {
			out.print("U");
			lh--;
		}
		out.print("L");
		out.print("D");
		int dh = ty - sy;
		int dw = tx - sx;
		while (dh > 0) {
			out.print("D");
			dh--;
		}
		while (dw > 0) {
			out.print("L");
			dw--;
		}
		out.print("U");
		out.flush();
	}
}