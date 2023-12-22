import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x[] = new int[num];
		int y[] = new int[num];
		int h[] = new int[num];
		for(int i = 0; i < num; i ++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int cX = 0;
		int cY = 0;
		int height = -1;
		boolean rightAns = false;
		end: for(cX = 0; cX <= 100; cX ++) {
			for(cY = 0; cY <= 100; cY ++) {
				height = h[0] == 0 ? -1 : h[0] + Math.abs(cX -x[0]) + Math.abs(cY -y[0]);
				rightAns = true;
				for(int i = 0; i < num; i ++) {
					int crtHeight = h[i] == 0 ? -1 : h[i] + Math.abs(cX -x[i]) + Math.abs(cY -y[i]);
					if(height == -1) {
						height = crtHeight;
					}else {
						if(height != crtHeight && crtHeight != -1) {
							rightAns = false;
							break;
						}
					}
				}
				if(rightAns) {
					for(int i = 0; i < num; i ++) {
						if(Math.max(height - Math.abs(cX -x[i]) - Math.abs(cY -y[i]), 0) != h[i]) {
							rightAns = false;
						}
					}
				}
				if(rightAns) {
					break end;
				}
			}
		}
		System.out.println(cX+" "+cY+" "+height);
	}
}