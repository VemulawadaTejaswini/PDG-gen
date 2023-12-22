import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

	static class Task {
		
		int NN = 200005;
		int MOD = 1000000007;
		int INF = 2000000000;
		long INFINITY = 2000000000000000000L;

		
		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt(), k = in.nextInt();
			String s=in.next();
			List<Integer> L = new ArrayList<>();
			int cnt = 1;
			char prev = s.charAt(0);
			for(int i=1;i<n;++i) {
				if(s.charAt(i) != prev) {
					if(prev == '0') {
						L.add(-cnt);
					} else {
						L.add(cnt);
					}
					cnt = 1;prev = s.charAt(i);
				} else {
					++cnt;
				}
			}
			if(prev == '0') {
				L.add(-cnt);
			} else {
				L.add(cnt);
			}
			n = L.size();
			int [] a = new int[n];
			int [] sum = new int[n];
			for(int i=0;i<n;++i)a[i] = L.get(i);
			for(int i=0;i<n;++i) {
				sum[i] = Math.abs(a[i]);
				if(i > 0) {
					sum[i] += sum[i - 1];
				}
			}
			int ans = 0;
			for(int i=0;i<n;++i) {
				int num = -1;
				if(a[i] > 0) {
					num = 2*k+1;
				} else {
					num = 2 * k;
				}
				int j = Math.max(i - num + 1, 0);
				ans = Math.max(ans, sum[i] - (j > 0 ? sum[j - 1] : 0));
			}
			out.println(ans);
		}
		
	}
	
	static void prepareIO(boolean isFileIO) {
		//long t1 = System.currentTimeMillis();
		Task solver = new Task();
		// Standard IO
		if(!isFileIO) { 
			InputStream inputStream = System.in;
	        OutputStream outputStream = System.out;
	        InputReader in = new InputReader(inputStream);
	        PrintWriter out = new PrintWriter(outputStream);
	        solver.solve(in, out);
	        //out.println("time(s): " + (1.0*(System.currentTimeMillis()-t1))/1000.0);
	        out.close();
		}
        // File IO
		else {
			String IPfilePath = System.getProperty("user.home") + "/Downloads/ip.in";
	        String OPfilePath = System.getProperty("user.home") + "/Downloads/op.out";
	        InputReader fin = new InputReader(IPfilePath);
	        PrintWriter fout = null;
	        try {
				fout = new PrintWriter(new File(OPfilePath));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        solver.solve(fin, fout);
	        //fout.println("time(s): " + (1.0*(System.currentTimeMillis()-t1))/1000.0);
	        fout.close();
		}
	}
	
	public static void main(String[] args) {
        prepareIO(false);
	}
	
	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        
        public InputReader(String filePath) {
        	File file = new File(filePath);
            try {
				reader = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            tokenizer = null;
        }
        
        public String nextLine() {
        	String str = "";
        	try {
				str = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return str;
        }
        
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
        	return Double.parseDouble(next());
        }
        
    }

}