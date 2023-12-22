import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int[] x = null;
	static int[] y = null;
	static int[] h = null;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		x = new int[n];
		y = new int[n];
		h = new int[n];
		for(int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		
		int cx, cy, H;
		for(cx = 0; cx <= 100; ++cx) {
			for(cy = 0; cy <= 100; ++cy) {
				H = 0;
				for(int i = 0; i < n; ++i) {
					int tH = 0;
					if(h[i] > 0) tH = Math.abs(x[i] - cx) + Math.abs(y[i] - cy) + h[i];
					
					if(H == 0) H = tH;
					else if(tH > 0 && tH != H) {
						H = 0;
						break;
					}
				}
				
				if(H > 0) {
					System.out.printf("%d %d %d\n", cx, cy, H);
					return;
				}
			}
		}
	}
}