
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int res = 0;
		int cntMax = Integer.MIN_VALUE;
		int cnt2ndMax = Integer.MIN_VALUE;
		int[] cnt = new int[10001];
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			set.add(num);
			cnt[num]++;
			if (cnt[num] > cntMax) {
				cnt2ndMax = cntMax;
				cntMax = cnt[num];
			} else if (cnt[num] > cnt2ndMax) {
				cnt2ndMax = cnt[num];
			}
		}
		
		if (set.size() == 1) {
			res = n / 2;
		} else {
			res = Math.abs(n / 2 - cntMax) + Math.abs(n / 2 - cnt2ndMax);
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
