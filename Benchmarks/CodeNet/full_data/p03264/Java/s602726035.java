
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  // AtCoder Beginner Contest 070
  // https://atcoder.jp/contests/abc070/tasks
  public static void main(String[] args) {
	FastReader sc = new FastReader();
	int k = sc.nextInt();
	int oddCnt = 0;
	int evenCnt = 0;
	
	for (int i = 1; i <= k; i++) {
		if (i % 2 == 0) {
			oddCnt++;
		} else {
			evenCnt++;
		}
	}
	System.out.println(oddCnt*evenCnt);
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
