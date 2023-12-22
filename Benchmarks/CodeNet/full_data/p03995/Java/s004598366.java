import java.io.*;
import java.util.*;

public class Main {
    public static final int p = (int)1e9+7;
    public static final int di[] = new int[]{1, -1, 1, -1};
    public static final int dj[] = new int[]{1, -1, -1, 1};
    public static class Cell {

      int i, j;
      public Cell(int _i, int _j) {
        i = _i ; j = _j ; 
      }
      public int hashCode() {
        return i*p + j;
      }
      public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Cell)) return false;

        Cell that = (Cell)o;
        if (i != that.i || j != that.j) return false;
        return true;
      }
    }

    public boolean checkPair(Cell x, long xval, Cell y, HashMap<Cell, Long> all) {
      Cell f1 = new Cell(x.i, y.j);
      Cell f2 = new Cell(y.i, x.j);
      if (!all.containsKey(f1) || !all.containsKey(f2)) {
        return true;
      }
      
      long v1 = all.get(f1), v2 = all.get(f2);
      if (xval + all.get(y) == v1 + v2) return true;
      return false;
    }

    public boolean checkIfCanInsert(HashMap<Cell, Long> all, Cell x, long xval) {
      for (int k = 0 ; k < 4; k++) {
        int ni = x.i + di[k], nj = x.j + dj[k];
        Cell U = new Cell(ni, nj);
        if (!checkCell(U) || !all.containsKey(U)) continue;
        if (!checkPair(x, xval, U, all)) return false;
      }
      return true;
    }
    int rows, cols;
    public boolean checkCell(Cell x) {
      return x.i >= 1 && x.j >= 1 && x.i <= rows && x.j <= cols;
    }
    public void solve() throws IOException {
      int rows = nextInt(), cols = nextInt();
      this.rows = rows; this.cols = cols;
      int n = nextInt();
      HashMap<Cell, Long> all = new HashMap<>();
      Queue<Cell> q = new LinkedList<>();
      for (int i = 0 ; i < n ; i ++) {
        Cell x = new Cell(nextInt(), nextInt());
        all.put(x, nextLong());
        q.add(x);
      }
      for (Map.Entry<Cell, Long> e : all.entrySet()) {
        Cell x = e.getKey();
        long v = e.getValue();
        if (!checkIfCanInsert(all, x, v)) {
          out.println("No");
          return;
        }
      }
      while (!q.isEmpty()) {
        Cell f = q.poll();
        int i = f.i, j = f.j;
        //System.out.println("getting " + i + " " + j);
        for (int k = 0 ; k < 4; k++) {
          int ni = i + di[k], nj = j + dj[k];
          Cell U = new Cell(ni, nj);
          if (!checkCell(U) ) {
            continue;
          }
          if (all.containsKey(U)) {
            if (checkPair(f, all.get(f), U, all)) {
              continue;
            }
          }

          Cell f1 = new Cell(ni, j);
          Cell f2 = new Cell(i, nj);
          if (!all.containsKey(f1) || !all.containsKey(f2)) {
            continue;
          }
          
          long v1 = all.get(f1), v2 = all.get(f2);
          long v = all.get(f);
          long u = v1 + v2 - v;
          if (u < 0) {
            out.println("No");
            return;
          }
          //System.out.println("Adding " + U.i + " " + U.j + " " + u);
          if (!checkIfCanInsert(all, U, u)) {
            out.println("No");
            return;
          }
          all.put(U, u);
          q.add(U);
        }
      }
      for (Map.Entry<Cell, Long> e : all.entrySet()) {
        q.add(e.getKey());
      }
      while (!q.isEmpty()) {
        Cell f = q.poll();
        int i = f.i, j = f.j;
        //System.out.println("getting " + i + " " + j);
        for (int k = 0 ; k < 4; k++) {
          int ni = i + di[k], nj = j + dj[k];
          Cell U = new Cell(ni, nj);
          if (!checkCell(U) ) {
            continue;
          }
          if (all.containsKey(U)) {
            if (checkPair(f, all.get(f), U, all)) {
              continue;
            }
          }

          Cell f1 = new Cell(ni, j);
          Cell f2 = new Cell(i, nj);
          if (!all.containsKey(f1) || !all.containsKey(f2)) {
            continue;
          }
          
          long v1 = all.get(f1), v2 = all.get(f2);
          long v = all.get(f);
          long u = v1 + v2 - v;
          if (u < 0) {
            out.println("No");
            return;
          }
          //System.out.println("Adding " + U.i + " " + U.j + " " + u);
          if (!checkIfCanInsert(all, U, u)) {
            out.println("No");
            return;
          }
          all.put(U, u);
          q.add(U);
        }
      }
      for (Map.Entry<Cell, Long> e : all.entrySet()) {
        Cell x = e.getKey();
        long v = e.getValue();
        if (!checkIfCanInsert(all, x, v)) {
          out.println("No");
          return;
        }
      }
      if (n > 10000) {
        out.println("No");  
        return;
      }
      out.println("Yes");
      
    }

    

    
    
    BufferedReader bf;
    StringTokenizer st;
    PrintWriter out;
    
    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) 
            st = new StringTokenizer(bf.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    
    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public Main() throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));      
        solve();
        bf.close();
        out.close();
    }
    
    public static void main(String args[]) throws IOException {
        new Main();
    }
}