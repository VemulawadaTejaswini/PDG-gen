import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));

    int N = sc.nextInt();
    int K = sc.nextInt();
    ArrayList<Long> H = new ArrayList<>();
    H.ensureCapacity(N);

    for (int i = 0; i < N; i++) {
      H.add(sc.nextLong());
    }

    Collections.sort(H, Collections.reverseOrder());

    long ans = 0;
    for (long i : H) {
      if (K > 0) {
        K--;
      } else {
        ans += i;
      }
    }

    out.println(ans);

    out.close();
  }

  public static PrintWriter out;

  public static class Scanner {
    BufferedReader br;
    StringTokenizer st;

    public Scanner() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }
    
    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }

  }
}