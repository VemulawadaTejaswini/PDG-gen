public class Main {
  public boolean solve() {
    FastReader fr = new FastReader();
    int N = fr.nextInt();
    int [] A = new int[N];
    int [] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = fr.nextInt();
    }
    for (int i = 0; i < N; i++) {
      B[i] = fr.nextInt();
    }

    Arrays.sort(A);
    Arrays.sort(B);
    for (int i = 0; i < N; i++) {
      if (A[i] > B[i]) return false;
    }
    
    return true;
  }

  public static void main(String [] args) {
    System.out.println(new Main().solve() ? "Yes" : "No");
  }
}

class FastReader {
  BufferedReader br;
  StringTokenizer st;

  public FastReader() {
    br = new BufferedReader(new
        InputStreamReader(System.in));
  }

  String next() {
    while (st == null || !st.hasMoreElements())
    {
      try
      {
        st = new StringTokenizer(br.readLine());
      }
      catch (IOException e)
      {
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
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return str;
  }
}