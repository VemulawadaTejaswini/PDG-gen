import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 3);
        int h = Integer.parseInt(first[0]);
        int w = Integer.parseInt(first[1]);
        int n = Integer.parseInt(first[2]);
        HashMap<Point, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ", 2);
            int hh = Integer.parseInt(line[0]);
            int ww = Integer.parseInt(line[1]);
            for (int a = Math.max(hh - 2, 1); a <= hh && a + 2 <= h; a++) {
                for (int b = Math.max(ww - 2, 1); b <= ww && b + 2 <= w; b++) {
                    Point p = new Point(a, b);
                    if (map.containsKey(p)) {
                        map.put(p, map.get(p) + 1);
                    } else {
                        map.put(p, 1);
                    }
                }
            }
        }
        long[] ans = new long[10];
        for (int x : map.values()) {
            ans[x]++;
        }
        ans[0] = (long)(h - 2) * (w - 2) - map.size();
        StringBuilder sb = new StringBuilder();
        for (long x : ans) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
    
    static class Point {
        int height;
        int width;
        
        public Point (int height, int width) {
            this.height = height;
            this.width = width;
        }
        
        public int hashCode() {
            return height;
        }
        
        public boolean equals(Object o) {
            Point p = (Point) o;
            return height == p.height && width == p.width;
        }
        
        public String toString() {
            return height + ":" + width;
        }
    }
}