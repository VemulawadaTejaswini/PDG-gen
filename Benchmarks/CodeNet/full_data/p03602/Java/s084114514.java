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
    long[][] dist = new long[n][n];
    long total = 0;
    for (int i=0; i<n; i++) {
      String[] s = br.readLine().split(" ");
      for (int j=0; j<n; j++) {
        dist[i][j] = Long.parseLong(s[j]);
        if (i<j)
          total += dist[i][j];
      }
    }
    
    boolean valid = true;
    for (int k=0; k<n; k++) {
      for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
          long midDist = dist[i][k]+dist[k][j];
          if (midDist<dist[i][j]) {
            valid = false;
            System.out.println("-1");
            return;
          }
        }
      }
    }

    long sub = 0;
    boolean[][] subbed = new boolean[n][n];
    for (int k=0; k<n; k++) {
      for (int i=0; i<n; i++) {
        if (i==k)
          continue;
        for (int j=0; j<i; j++) {
          if (j==k)
            continue;
          if (dist[i][k]+dist[k][j]==dist[i][j] && !subbed[i][j]) {
            subbed[i][j] = true;
            subbed[j][i] = true;
            sub += dist[i][j];
          }
        }
      }
    }
    System.out.println(total-sub);

    /*
    long sum = 0;
    Edge[] edges = new Edge[(n*(n-1)/2)];
    int index = 0;
    for (int i=0; i<n; i++) {
      for (int j=0; j<i; j++) {
        edges[index] = new Edge(i,j,dist[i][j]);
        index++;
      }
    }
    Arrays.sort(edges);
    long[][] dist2 = new long[n][n];
    for (int i=0; i<n; i++) {
      Arrays.fill(dist2[i],(Long.MAX_VALUE/2)-2);
    }
    for (int i=0; i<edges.length; i++) {
      Edge e = edges[i];
      int u = e.u;
      int v = e.v;
      long d = e.d;
      if (dist2[u][v]>dist[u][v]) {
        sum += d;
        dist2[u][v] = d;
        dist2[v][u] = d;
        for (int j=0; j<n; j++) {
          for (int k=0; k<j; k++) {
            long d1 = dist2[j][u]+d+dist2[v][k];
            long d2 = dist2[j][v]+d+dist2[u][k];
            if (d1<dist2[j][k]) {
              dist2[j][k] = d1;
              dist2[k][j] = d1;
            }
            if (d2<dist2[j][k]) {
              dist2[j][k] = d2;
              dist2[k][j] = d1;
            }
          }
        }
      }
    }
    */
  }
}
class Edge implements Comparable<Edge> {
  int u,v;
  long d;
  public Edge(int uu, int vv, long dd) {
    u = uu;
    v = vv;
    d = dd;
  }
  public int compareTo(Edge e2) {
    return (int)Math.signum(d-e2.d);
  }
}
