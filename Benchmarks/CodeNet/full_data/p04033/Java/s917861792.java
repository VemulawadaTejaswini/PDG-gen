    import java.io.*;
    import java.util.*;
    import java.math.*;
     
    public class Main implements Runnable {
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out), false);
      static StringTokenizer st = new StringTokenizer("");
     
      public static String next() {
        try {
        while (!st.hasMoreTokens()) {
          String s = br.readLine();
          if (s == null)
            return null;
          st = new StringTokenizer(s);
        }
        return st.nextToken();
        } catch(Exception e)  {
          return  null;
        }
      }
     
      public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "Main", 1<<26).start();
      }
     
      public void run() {
        //
        final int N = Integer.parseInt( next() );
        final int M = Integer.parseInt( next() );
        final int[] from = new int[M];
        final int[] to = new int[M];
        for (int e = 0; e < M; e++) {
          final int a = Integer.parseInt( next() ) - 1;
          final int b = Integer.parseInt( next() ) - 1;
          from[e] = a;
          to[e] = b;
        }
     
        final int Q = Integer.parseInt( next() );
        final int[] queryX = new int[Q];
        final int[] queryY = new int[Q];
        final int[] queryZ = new int[Q];
        for (int q = 0; q < Q; q++) {
          final int a = Integer.parseInt( next() ) - 1;
          final int b = Integer.parseInt( next() ) - 1;
          final int c = Integer.parseInt( next() );
          queryX[q] = a;
          queryY[q] = b;
          queryZ[q] = c;
        }
     
        final int[] answer = new int[Q];
        Queue<State> queue = new LinkedList<>();
        UnionFind ds = new UnionFind(N);
        int dsNext = 0;
        List<Integer> queries = new ArrayList<>();
        for (int q = 0; q < Q; q++)  queries.add(q);
     
        queue.add( new State(0, M - 1, queries) );
        while (!queue.isEmpty()) {
          State current = queue.poll();
      //    System.out.println("processing: " + current);
          if (current.left > current.right) {
            continue;
          }
     
          int mid = current.middle();
          if (mid < dsNext - 1) {
            ds.init();
            dsNext = 0;
          }
     
          while (dsNext <= mid) {
            ds.join(from[dsNext], to[dsNext]);
            dsNext++;
          }
     
          List<Integer> lower = new ArrayList<>();
          List<Integer> upper = new ArrayList<>();
          for (int q : current.queries) {
            int x = queryX[q];
            int y = queryY[q];
            int z = queryZ[q];
            int visited = ds.size(x);
            if (!ds.connected(x, y)) {
              visited += ds.size(y);
            }
            if (visited >= z) {
              answer[q] = mid;
              lower.add(q);
            } else {
              upper.add(q);
            }
          }
          if (!lower.isEmpty()) {
            State s = new State(current.left, mid, lower);
            queue.add(s);
          }
          if (!upper.isEmpty()) {
            State s = new State(mid + 1, current.right, upper);
            queue.add(s);
          }
        }
     
        for (int q = 0; q < Q; q++) {
          int x = queryX[q];
          int y = queryY[q];
          int z = queryZ[q];
          int visited = x == y ? 1 : 2;
          if (visited >= z) {
            answer[q] = -1;
          }
          out.println(answer[q] + 1);
        }
        //
        out.flush();
        System.exit(0);
      }
    }
     
    class State {
      // [left. right]
      final int left, right;
      final List<Integer> queries;
      State(final int left, final int right, final List<Integer> queries) {
        this.left = left;
        this.right = right;
        this.queries = queries;
      }
     
      int middle() {
        return (left + right) >> 1;
      }
     
      public String toString() {
        return String.format("[%d, %d] = %s", left + 1, right + 1, queries);
      }
    }
     
    class UnionFind {
      final int[] parent;
      final int[] size;
      UnionFind(final int N) {
        parent = new int[N];
        size = new int[N];
        init();
      }
     
      void init() {
        for (int k = 0; k < parent.length; k++) {
          parent[k] = k;
          size[k] = 1;
        }
      }
     
      int root(int id) {
        if (id == parent[id])
          return id;
        return parent[id] = root(parent[id]);
      }
     
      void join(int x, int y) {
        final int a = root(x);
        final int b = root(y);
        if (a == b)
          return;
     
        parent[a] = b;
        size[b] += size[a];
      }
     
      int size(final int id)  {
        return size[ root(id) ];
      }
     
      boolean connected(int x, int y) {
        return root(x) == root(y);
      }
    }