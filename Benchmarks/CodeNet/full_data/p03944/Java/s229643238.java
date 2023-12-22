import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x0 = 0, y0 = 0;
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	int a = sc.nextInt();
        	if(a == 1) {
        		x0 = Math.max(x0, x);
        	} else if (a == 2) {
        		x1 = Math.min(x1, x);
        	} else if (a == 3) {
        	    y0 = Math.max(y0, y);
        	} else {
        		y1 = Math.min(y1, y);
        	}
        }
        int area = 0;
        if(x0 < x1 && y0 < y1)
        	area = (x1 - x0) * (y1 - y0);
        System.out.println(area);
    }
}
