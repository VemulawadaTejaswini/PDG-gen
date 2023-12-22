/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    Pt[] xPts = new Pt[n];
    Pt[] yPts = new Pt[n];
    for (int i=0; i<n; i++) {
      String[] s=  br.readLine().split(" ");
      int x = Integer.parseInt(s[0]);
      int y = Integer.parseInt(s[1]);
      Pt p = new Pt(i,x,y);
      xPts[i] = p;
      yPts[i] = p;
    } 
    Arrays.sort(xPts, new PtXComparator());
    Arrays.sort(yPts, new PtYComparator());
    
    UnionFind uf = new UnionFind(n);
    long sum = 0;
    HashMap<Integer,Integer> iToXi = new HashMap<>();
    HashMap<Integer,Integer> iToYi = new HashMap<>();
    for (int i=0; i<n; i++) {
      iToXi.put(xPts[i].i,i);
      iToYi.put(yPts[i].i,i);
    }
    for (int i=0; i<n; i++) {
      int xi = iToXi.get(i);
      int yi = iToYi.get(i);
      int min = 1_001_000_000;
      int conn = -1;
      if (xi>0 && uf.find(i)!=uf.find(xPts[xi-1].i) && xPts[xi].x-xPts[xi-1].x<min) {
        min = xPts[xi].x-xPts[xi-1].x;
        conn = xPts[xi-1].i;
      }
      if (yi>0 && uf.find(i)!=uf.find(yPts[yi-1].i) &&yPts[yi].y-yPts[yi-1].y<min) {
        min = yPts[yi].y-yPts[yi-1].y;
        conn = yPts[yi-1].i;
      }
      if (xi<n-1 && uf.find(i)!=uf.find(xPts[xi+1].i) &&xPts[xi+1].x-xPts[xi].x<min) {
        min = xPts[xi+1].x-xPts[xi].x;
        conn = xPts[xi+1].i;
      }
      if (yi<n-1 && uf.find(i)!=uf.find(yPts[yi+1].i) &&yPts[yi+1].y-yPts[yi].y<min) {
        min = yPts[yi+1].y-yPts[yi].y;
        conn = yPts[yi+1].i;
      }
      if (conn!=-1) {
        uf.union(i,conn);
        sum += min;
      }
    }
    System.out.println(sum);
  }
}
class UnionFind {
    int[] id, sz;
    public UnionFind(int n) {
      id = new int[n]; sz = new int[n];
      for (int i = 0; i < n; i++) { id[i] = i; sz[i] = 1; } }
        int find(int p) {
              int rt = p;
                  while (rt != id[rt]) rt = id[rt];
                      while (p != rt) { int next = id[p]; id[p] = rt; p = next; }
                          return rt; }
                            boolean connected(int p, int q) { return find(p) == find(q); }
                              int getSize(int p) { return sz[find(p)]; }
                                int countSets() {
                                      int nSets = 0;
                                          for (int i = 0; i < id.length; i++) if (id[i] == i) nSets++;
                                              return nSets; }
                                                void union(int p, int q) {
                                                      int r1 = find(p), r2 = find(q);
                                                          if (r1 == r2) return;
                                                              sz[r2] += sz[r1]; id[r1] = r2; 
                                                                } }

class PtXComparator implements Comparator<Pt> {
  public int compare(Pt p1, Pt p2) {
    return p1.x-p2.x;
  }
}
class PtYComparator implements Comparator<Pt> {
  public int compare(Pt p1, Pt p2) {
    return p1.y-p2.y;
  }
}
class Pt {
  int i;
  int x;
  int y;
  public Pt(int ii, int xx, int yy) {
    i = ii;
    x = xx;
    y = yy;
  }
}
