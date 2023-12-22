import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		int xya[][] = new int[N][3];
		int ans = 0;
		
		int xmin = 0;
		int xmax = W;
		int ymin = 0;
		int ymax = H;
		
		for(int i=0;i<N;i++) {
			for(int y=0;y<3;y++) {
				xya[i][y] = Integer.parseInt(sc.next());
			}
		}
		
		for(int i=0;i<N;i++) {
			switch(xya[i][2]) {
			case 1:
				xmin = Math.max(xya[i][0],xmin);
				break;
			case 2:
				xmax = Math.min(xya[i][0],xmax);
				break;
			case 3:
				ymin = Math.max(xya[i][1],ymin);
				break;
			case 4:
				ymax = Math.min(xya[i][1],ymax);
				break;
			}
		}
		
		if((xmax - xmin) * (ymax - ymin) > 0) {
			ans = (xmax - xmin) * (ymax - ymin);
		}
		
		System.out.println(ans);
	}
}
