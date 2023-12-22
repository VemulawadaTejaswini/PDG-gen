    import java.io.*;
    import java.util.*;
     
    public class Main {
      public static void main (String[] args) {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
     
        while (in.hasNext()) {
          int N = in.nextInt();
          int M = in.nextInt();
          int Q = in.nextInt();
          int[][] table = new int[N + 1][N + 1];
     
          while (M-- > 0) {
            ++table[in.nextInt()][in.nextInt()];
          }
          
          
          
          while (Q-- > 0){
            int p = in.nextInt();
            int q = in.nextInt();
            int sum = 0;
            for (int i = p; i <= q; ++i) {
              for (int j = p; j <= q; ++j) {
                sum+=table[i][j];
              }
            }
            
            out.println(sum);
          }
        }
        
        out.close();
      }
        private static class FastScanner {
    	BufferedReader br;
    	StringTokenizer st;
     
    	public FastScanner() {
    		br = new BufferedReader(new InputStreamReader(System.in));
    	}
    	
    	public FastScanner(InputStream is) {
    		br = new BufferedReader(new InputStreamReader(is));
    	}
     
    	public FastScanner(File f) {
    		try {
    			br = new BufferedReader(new FileReader(f));
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}
    	}
    	
    	// source: http://codeforces.ru/blog/entry/7805#comment-134954
    	public boolean hasNext() {
    		while (st == null || !st.hasMoreTokens()) {
    			try {
    				String line = br.readLine();
    				if (line == null) {
    					return false;
    				}
    				st = new StringTokenizer(line);
    			} catch (IOException e) {
    				throw new RuntimeException(e);
    			}
    		}	
    		return true;
    	}
     
    	public String nextLine() {
    		String ret = null;
    		try {
    			ret = br.readLine();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
     
    		return ret;
    	}
     
    	public String next() {
    		while (st == null || !st.hasMoreTokens()) {
    			try {
    				st = new StringTokenizer(br.readLine());
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    		return st.nextToken();
    	}
     
    	public int nextInt() {
    		return Integer.parseInt(next());
    	}
        }
    }