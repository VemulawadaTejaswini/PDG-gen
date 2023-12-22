import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] a = new int[n];
        String[] ss = br.readLine().split(" ");
        
        long sum = 0;
        for (int i = 0; i < n; i ++) {
            a[i] = Integer.parseInt(ss[i]);
        }
        
        int b;
        int c;
        Point[] ps = new Point[m];
        for (int i = 0; i < m; i++) {
            String[] sss = br.readLine().split(" ");
            b = Integer.parseInt(sss[0]);
            c = Integer.parseInt(sss[1]);
            Point p = new Point(b, c);
            ps[i] = p;
        }
        
        Arrays.sort(ps, new Comparator<Point>() {
        	public int compare(Point p1, Point p2) {
        		int temp = p1.y - p2.y;
        		if (temp == 0){
        			return p1.x - p2.x;
        		}
        		return temp;
        	}
        });
        
        Arrays.sort(a);
        outer: for (int i = m-1; 0 <= i; i--) {
            Arrays.sort(a);
            for (int j = 0; j < ps[i].x; j++) {
                if (a[j] < ps[i].y) {
                    a[j] = ps[i].y;
                }
                else {
                    break outer;
                }
            }
            
        }
        
        sum = 0;
        for (int i = 0; i < n; i ++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}



