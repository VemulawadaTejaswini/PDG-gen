import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		int[] chars = new int[26];
		int used = 0;
		for (int i = 0; i < s.length(); i++) {
			chars[s.charAt(i) - 'a']++;
			used++;
		}
		
		if (used == 26) {
			int desc = 0;
			int firstDescIdx = -1;
			
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) < s.charAt(i-1)) {
					desc++;
				}
				if (firstDescIdx == - 1 && Math.abs((s.charAt(i) - 'a') - (s.charAt(i- 1) - 'a')) > 1) { firstDescIdx = i; }
				//System.out.println(firstDescIdx);
				if (desc == 25) {
					// The last word
					System.out.println("-1");
					System.exit(0);
				}  
			}
			String newStr = s.substring(0, firstDescIdx);
			// System.out.println(newStr);
			
			for (int i = 0; i < newStr.length(); i++) {
				chars[newStr.charAt(i) - 'a']--;
			}
			int idx = -1;
			for (int i = 0; i < 26; i++) {
				if (chars[i] == 1) {
					idx = i;
					break;
				}
			}
			
			System.out.println(newStr.substring(0, firstDescIdx-1) + (char)(idx + 'a'));
			
		} else {
			int idx = -1;
			
			for (int i = 0; i < 26; i++) {
				if (chars[i] == 0) {
					idx = i;
					break;
				}
			}
			
			System.out.println(s + (char)(idx + 'a'));
		}
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
