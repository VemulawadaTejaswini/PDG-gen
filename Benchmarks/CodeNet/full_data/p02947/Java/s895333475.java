
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int n = sc.nextInt();
    Map<String, Long> map = new HashMap<>();
    
    for (int i = 0; i < n; i++) {
    	String s = sc.next();
    	char[] tmpChar = s.toCharArray();
    	Arrays.sort(tmpChar);
    	String key = new String(tmpChar);
    	
    	if (map.containsKey(key)) {
    		if (map.get(key) == 0) {
    			map.put(key, 1L);
    		} else {
    			map.put(key, map.get(key) + 1);
    		}
    	} else {
    		map.put(key, 0L);
    	}
    }
    long res = 0;
    
    for (String key: map.keySet()) {
    	long a = map.get(key);
    	res += (((a + 1) * a) / 2);
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
