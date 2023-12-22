/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  static Pt[] pts;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    pts = new Pt[n];
    Pt[] xPts = new Pt[n];
    Pt[] yPts = new Pt[n];
    for (int i=0; i<n; i++) {
      String[] s=  br.readLine().split(" ");
      int x = Integer.parseInt(s[0]);
      int y = Integer.parseInt(s[1]);
      Pt p = new Pt(i,x,y);
      pts[i] = p;
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
      int xiMin = iToXi.get(uf.minX[uf.find(i)]);
      int xiMax = iToXi.get(uf.maxX[uf.find(i)]);
      int yiMin = iToYi.get(uf.minY[uf.find(i)]);
      int yiMax = iToYi.get(uf.maxY[uf.find(i)]);
      //System.out.println(Arrays.toString(uf.minX));
      //System.out.println(Arrays.toString(uf.maxX));
      //System.out.println(Arrays.toString(uf.minY));
      //System.out.println(Arrays.toString(uf.maxY));
      int min = 1_001_000_000;
      int conn = -1;
      //System.out.printf("xMin: %d, xMax: %d, yMin: %d, yMax: %d\n",xiMin, xiMax, yiMin, yiMax);
      if (xiMin>0 && uf.find(i)!=uf.find(xPts[xiMin-1].i) && xPts[xiMin].x-xPts[xiMin-1].x<min) {
        min = xPts[xiMin].x-xPts[xiMin-1].x;
        conn = xPts[xiMin-1].i;
      }
      if (yiMin>0 && uf.find(i)!=uf.find(yPts[yiMin-1].i) &&yPts[yiMin].y-yPts[yiMin-1].y<min) {
        min = yPts[yiMin].y-yPts[yiMin-1].y;
        conn = yPts[yiMin-1].i;
      }
      if (xiMax<n-1 && uf.find(i)!=uf.find(xPts[xiMax+1].i) &&xPts[xiMax+1].x-xPts[xiMax].x<min) {
        min = xPts[xiMax+1].x-xPts[xiMax].x;
        conn = xPts[xiMax+1].i;
      }
      if (yiMax<n-1 && uf.find(i)!=uf.find(yPts[yiMax+1].i) &&yPts[yiMax+1].y-yPts[yiMax].y<min) {
        min = yPts[yiMax+1].y-yPts[yiMax].y;
        conn = yPts[yiMax+1].i;
      }

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

      //System.out.println("Connecting component containing "+i+" to component containing "+conn+" at cost "+min);
      if (conn!=-1) {
        uf.union(i,conn);
        sum += min;
      }
    }
    System.out.println(sum);
  }
  static int getX(int i) {
    return pts[i].x;
  }
  static int getY(int i) {
    return pts[i].y;
  }
}
class UnionFind {
  int[] id, sz;
  int[] maxX;
  int[] maxY;
  int[] minX;
  int[] minY;
  public UnionFind(int n) {
    id = new int[n]; sz = new int[n];
    maxX = new int[n];
    maxY = new int[n];
    minX = new int[n];
    minY = new int[n];
    for (int i = 0; i < n; i++) { 
      id[i] = i; sz[i] = 1;
      maxX[i] = i;
      maxY[i] = i;
      minX[i] = i;
      minY[i] = i;
    }
  }
  int find(int p) {
    int rt = p;
    while (rt != id[rt]) rt = id[rt];
    return rt; 
  }
  boolean connected(int p, int q) { 
    return find(p) == find(q); 
  }
  int getSize(int p) { return sz[find(p)]; }
  int countSets() {
    int nSets = 0;
    for (int i = 0; i < id.length; i++) if (id[i] == i) nSets++;
    return nSets; }
  void union(int p, int q) {
    int r1 = find(p), r2 = find(q);
    if (r1 == r2) return;
    sz[r2] += sz[r1]; 
    id[r1] = r2;
    //parent is r2
    if (Main.getX(maxX[r1])>Main.getX(maxX[r2]))
      maxX[r2] = maxX[r1];
    if (Main.getY(maxY[r1])>Main.getY(maxY[r2]))
      maxY[r2] = maxY[r1];
    if (Main.getX(minX[r1])<Main.getX(minX[r2]))
      minX[r2] = minX[r1];
    if (Main.getX(minY[r1])<Main.getY(minY[r2]))
      minY[r2] = minY[r1];
  } 
}

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
