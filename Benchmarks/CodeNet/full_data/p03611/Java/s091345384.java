
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
	FastReader sc = new FastReader();
	int n = sc.nextInt();
	Map<Integer, Integer> map = new HashMap<>();
	int res = 0;
	for (int i = 0; i < n; i++) {
		int curr = sc.nextInt();
		int prev = curr - 1;
		int next = curr + 1;

		if (prev >= 0) { map.put(prev, map.getOrDefault(prev, 0) + 1); }
		map.put(curr, map.getOrDefault(curr, 0) + 1);
		map.put(next, map.getOrDefault(next, 0) + 1);
	}
	for (int v: map.values()) {
		res = Math.max(res, v);
	}
	System.out.println(res);
  }
  
  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
  
    String next() { 
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException  e) {
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
        try{
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
      }
  }
}
