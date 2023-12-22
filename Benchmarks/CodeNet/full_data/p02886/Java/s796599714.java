import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String [] args) {
    System.out.println(solve());
  }
  
  public static long solve() {
    FastReader fr = new FastReader();
    int N = fr.nextInt();
    int[] d = new int[N];
    long sum = 0;
    long power = 0;
    for (int i = 0; i < N; i++) {
      d[i] = fr.nextInt();
      sum += d[i];
      power += d[i] * d[i];
    }
    
	return sum * sum - power;
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