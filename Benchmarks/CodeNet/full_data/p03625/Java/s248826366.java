
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
	FastReader sc = new FastReader();
	int n = sc.nextInt();
	Map<Long, Long> map = new TreeMap<>(Collections.reverseOrder());
	
	for (int i = 0; i < n; i++) {
		long l = sc.nextLong();
		map.put(l, map.getOrDefault(l, 0L) + 1L);
	}

	long firstEdge = 0;
	long secondEdge = 0;
	int k = 2;
	for (long key: map.keySet()) {
		long cnt = map.get(key);
		
		// 如果有邊已經被取到，即使遇到正方形也不能取
		if (cnt >= 4 && k == 2) {
			System.out.println(key * key);
			System.exit(0);
		}
		
		if (cnt >= 2) {
			if (k == 2) {
				firstEdge = key;
				k--;
			} else if (k == 1) {
				secondEdge = key;
				k--;
			}
		}
		
		if (k == 0) {
			System.out.println(firstEdge * secondEdge);
			System.exit(0);
		}
	}
	System.out.println(0);
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
