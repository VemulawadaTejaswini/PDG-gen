import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x, y, h;
		ArrayList<Integer> xlist = new ArrayList<Integer>();
		ArrayList<Integer> ylist = new ArrayList<Integer>();
		ArrayList<Integer> hlist = new ArrayList<Integer>();
		for ( int i = 0; i < n; i++ ) {
			x = in.nextInt();
			y = in.nextInt();
			h = in.nextInt();

			if ( h != 0 ) {
				xlist.add(x);
				ylist.add(y);
				hlist.add(h);
			}
		}
		in.close();

		int H = 0;
		for ( int cy = 0; cy <= 100; cy++ ) {
			for ( int cx = 0; cx <= 100; cx++ ) {
				boolean match = true;
				for ( int i = 1; i < hlist.size(); i++ ) {
					int preH = hlist.get(i - 1) + Math.abs(xlist.get(i - 1) - cx) + Math.abs(ylist.get(i - 1) - cy);
					int nowH = hlist.get(i) + Math.abs(xlist.get(i) - cx) + Math.abs(ylist.get(i) - cy);

					if ( preH != nowH ) {
						match = false;
						break;
					} else {
						H = nowH;
					}
				}
				if ( match ) {
					System.out.println(cx + " " + cy + " " + H);
					return;
				}
			}
		}
	}
}