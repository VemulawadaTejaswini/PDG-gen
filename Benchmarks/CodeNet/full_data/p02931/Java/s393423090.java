import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] r = new int[n];
        int[] c = new int[n];
        for(int i=0; i<n; i++) {
           st = new StringTokenizer(bf.readLine());
           r[i] = Integer.parseInt(st.nextToken());
           c[i] = Integer.parseInt(st.nextToken());
           a[i] = Integer.parseInt(st.nextToken());
        }
        Point[] points = new Point[n];
        for(int i=0; i<n; i++) points[i] = new Point(r[i], c[i], a[i]);

        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();
        Map<Integer, ArrayList<Integer>> rowmap = new HashMap<Integer, ArrayList<Integer>>();
        Map<Integer, ArrayList<Integer>> colmap = new HashMap<Integer, ArrayList<Integer>>();
        Arrays.sort(points);
        long sum = 0;
        ArrayList<Integer> conflicts = new ArrayList<Integer>();
        Set<Integer> taken = new HashSet<Integer>();
        for(int i=0; i<n; i++) {
          boolean b1 = !rows.contains(points[i].r);
          boolean b2 = !cols.contains(points[i].c);
          if(b1 && b2) {
            conflicts.add(i);
            taken.add(i);
            sum += points[i].a;
          }
          else if(b1 || b2) {
            sum += points[i].a;
            points[i].a = 0;
            taken.add(i);
          }
          rows.add(points[i].r);
          cols.add(points[i].c);
          if(b1) rowmap.put(points[i].r, new ArrayList<Integer>());
          if(b2) colmap.put(points[i].c, new ArrayList<Integer>());
          if(points[i].a != 0) {
          rowmap.get(points[i].r).add(i);
          colmap.get(points[i].c).add(i);
          }

        }
        for(int i=conflicts.size()-1; i>=0; i--) {
          Point p = points[conflicts.get(i)];
          int cur1 = 0; int val1 = -1;
          for(int j : rowmap.get(p.r)) {
            if(!taken.contains(j)) {
              val1 = j;
              cur1 = points[j].a;
              break;
            }
          }

          int cur2 = 0; int val2 = -1;
          for(int j : colmap.get(p.c)) {
            if(!taken.contains(j)) {
              val2 = j;
              cur2 = points[j].a;
              break;
            }
          }
          if(cur1 > cur2) {
            sum += cur1;
            taken.add(val1);
          }
          else {
            sum += cur2;
            taken.add(val2);
          }
        }
        out.println(sum);
        out.close(); System.exit(0);
    }
}
class Point implements Comparable<Point> {
  public int r;
  public int c;
  public int a;
  public Point(int r, int c, int a) {
    this.r = r;
    this.c = c;
    this.a = a;
  }
  @Override
  public boolean equals(Object o) {
    Point p = (Point)o;
    return (this.compareTo(p) == 0);
  }

  @Override
  public int compareTo(Point p) {
    if(this.a < p.a) return 1;
    if(this.a > p.a) return -1;
    if(this.r < p.r) return -1;
    if(this.r > p.r) return 1;
    if(this.c < p.c) return -1;
    if(this.c > p.c) return 1;
    return 0;
  }
}
