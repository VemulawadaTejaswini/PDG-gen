package testcontest;

import CodeLibrary.FastReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DIslandsWar {
    static class Point implements Comparable<Point> {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point other) {
            if(x > other.x) {
                return 1;
            } else if (x < other.x) {
                return -1;
            } else if (y > other.y) {
                return 1;
            } else if (y < other.y) {
                return -1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return new String("(" + x + "," + y + ")");
        }
    }

    public void solve(int testNumber, FastReader in, PrintWriter out) {
        int n = in.nextInt(), m = in.nextInt();
        List<Point> arr = new ArrayList<>(m);

        for(int i = 0; i < m; i++) {
            int a = in.nextInt(), b = in.nextInt();
            arr.add(new Point(a, b));
        }

        arr.add(new Point((int) 1e9, (int) 2e9));

        Collections.sort(arr);

        int ans = 0;
//        out.println(arr);
        for(int i = 1, lo = arr.get(0).x, hi = arr.get(0).y; i < arr.size(); i++) {
            Point cur = arr.get(i);
            if(cur.x >= hi) {
                ans++;
                lo = cur.x;
                hi = cur.y;
            } else {
                lo = cur.x;
                hi = Math.min(hi, cur.y);
            }
//            out.println("the current bounds are " + lo + " " + hi);
        }
        out.println(ans);
    }
}
