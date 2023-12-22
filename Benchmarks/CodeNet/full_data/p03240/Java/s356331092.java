import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];
		int h[] = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		int centerY = 0;
		int centerX = 0;
		int H = 0;
		for(int Y = 0; Y <= 100; Y++) {
			centerY = Y;
			out : for(int X = 0; X <= 100; X++) {
				centerX = X;
				in : for(int i = 0; i < N; i++) {
					if(h[i] != 0) {
						H = h[i] + Math.abs(x[i] - centerX) + Math.abs(y[i] - centerY);
						break in;
					}
				}
				for(int i = 0; i < N; i++) {
					if(h[i] + Math.abs(x[i] - centerX) + Math.abs(y[i] - centerY) != H) {
						continue out;
					}
				}
				System.out.println(centerX + " " + centerY + " " + H);
				return;
			}
		}
	}
}
