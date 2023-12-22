import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static class P {
		int x;
		int y;
	}
	
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int h = in.nextInt();
			int w = in.nextInt();
			List<P> pp = new ArrayList<P>();
			for (int row = 0; row < h; row++) {
				String s = in.next();
				for (int col = 0; col < w; col++) {
					char c = s.charAt(col);
					if (c == '#') {
						P p = new P();
						p.x = col;
						p.y = row;
						pp.add(p);
					}
				}
			}

			int r = 0;
			for (int row = 0; row < h; row++) {
				for (int col = 0; col < w; col++) {
					int mind = Integer.MAX_VALUE;
						for (P p : pp) {
							int xd = Math.abs(p.x - col);
							int yd = Math.abs(p.y - row);
							int d = xd + yd;
							if (d < mind) {
								mind = d;
							}
						}
						if (mind > r) {
							r = mind;
						}
				}
			}

			System.out.println(r);
		}
	}

}
