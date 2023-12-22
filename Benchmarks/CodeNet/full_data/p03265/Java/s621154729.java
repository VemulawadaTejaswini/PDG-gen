import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long x1 = parseLong(sc.next());
		long y1 = parseLong(sc.next());
		long x2 = parseLong(sc.next());
		long y2 = parseLong(sc.next());
		sc.close();
		long dx = x2-x1;
		long dy = y2-y1;
		long x3 = x2-dy;
		long y3 = y2+dx;
		long x4 = x3-dx;
		long y4 = y3-dy;
		out.printf("%d %d %d %d%n", x3, y3, x4, y4);
	}
}
