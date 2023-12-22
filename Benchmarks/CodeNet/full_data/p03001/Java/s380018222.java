import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();
//		double a = Math.min(x*h, (w-x)*h);
//		double b = Math.min(w*y, w*(h-y));
//		double c = Math.max(a, b);
		double c = (double)w*h/2;
		int fuku = 0;
		if(w==2*x && h == 2*y) fuku = 1;
		System.out.println(String.format("%.6f %d", c, fuku));
	}
}
