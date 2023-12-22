import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ABC130F {
	static double pnone = Integer.MAX_VALUE;
	static double mnone = Integer.MIN_VALUE;
	static double rmin = pnone;
	static double rmax = mnone;
	static double lmin = pnone;
	static double lmax = mnone;
	static double xmin = pnone;
	static double xmax = mnone;
	static double umin = pnone;
	static double umax = mnone;
	static double dmin = pnone;
	static double dmax = mnone;
	static double ymin = pnone;
	static double ymax = mnone;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Ten[] arr = new Ten[n];
		for (int i = 0; i < n; i++) {
			Ten t = new Ten(br.readLine());
			arr[i] = t;
		}
		br.close();

		for (int i = 0; i < n; i++) {
			Ten t = arr[i];
			if (t.dx == 1) {
				rmin = Math.min(rmin, t.x);
				rmax = Math.max(rmax, t.x);
			} else if (t.dx == -1) {
				lmin = Math.min(lmin, t.x);
				lmax = Math.max(lmax, t.x);
			} else {
				xmin = Math.min(xmin, t.x);
				xmax = Math.max(xmax, t.x);
			}
		}

		for (int i = 0; i < n; i++) {
			Ten t = arr[i];
			if (t.dy == 1) {
				umin = Math.min(umin, t.y);
				umax = Math.max(umax, t.y);
			} else if (t.dy == -1) {
				dmin = Math.min(dmin, t.y);
				dmax = Math.max(dmax, t.y);
			} else {
				ymin = Math.min(ymin, t.y);
				ymax = Math.max(ymax, t.y);
			}
		}

//		System.out.println("rmin: " + rmin);
//		System.out.println("rmax: " + rmax);
//		System.out.println("lmin: " + lmin);
//		System.out.println("lmax: " + lmax);
//		System.out.println("xmin: " + xmin);
//		System.out.println("xmax: " + xmax);
//		System.out.println("umin: " + umin);
//		System.out.println("umax: " + umax);
//		System.out.println("dmin: " + dmin);
//		System.out.println("dmax: " + dmax);
//		System.out.println("ymin: " + ymin);
//		System.out.println("ymax: " + ymax);

		Set<Double> set = new HashSet<Double>();
		set.add(0d);
		if (rmin < lmin) set.add((lmin - rmin) / 2);
		if (rmin < xmin) set.add(xmin - rmin);
		if (xmin < lmin) set.add(lmin - xmin);
		if (rmax < lmax) set.add((lmax - rmax) / 2);
		if (rmax < xmax) set.add(xmax - rmax);
		if (xmax < lmax) set.add(lmax - xmax);
		if (umin < dmin) set.add((dmin - umin) / 2);
		if (umin < ymin) set.add(ymin - umin);
		if (ymin < dmin) set.add(dmin - ymin);
		if (umax < dmax) set.add((dmax - umax) / 2);
		if (umax < ymax) set.add(ymax - umax);
		if (ymax < dmax) set.add(dmax - ymax);

		double ans = Double.MAX_VALUE;
		for (double t : set) {
			ans = Math.min(ans, calc(t));
		}
		System.out.println(ans);
	}

	static double calc(double t) {
		double xxmax = xmax;
		xxmax = Math.max(xxmax, lmax - t);
		xxmax = Math.max(xxmax, rmax + t);
		double xxmin = xmin;
		xxmin = Math.min(xxmin, lmin - t);
		xxmin = Math.min(xxmin, rmin + t);

		double yymax = ymax;
		yymax = Math.max(yymax, dmax - t);
		yymax = Math.max(yymax, umax + t);
		double yymin = ymin;
		yymin = Math.min(yymin, dmin - t);
		yymin = Math.min(yymin, umin + t);

		return (xxmax - xxmin) * (yymax - yymin);
	}

	static class Ten {
		double x, y;
		String d;
		int dx, dy;

		public Ten(String s) {
			String[] sa = s.split(" ");
			x = Long.parseLong(sa[0]);
			y = Long.parseLong(sa[1]);
			d = sa[2];
			if (d.equals("R")) {
				dx = 1;
			} else if (d.equals("L")) {
				dx = -1;
			} else if (d.equals("U")) {
				dy = 1;
			} else if (d.equals("D")) {
				dy = -1;
			}
		}
	}
}
