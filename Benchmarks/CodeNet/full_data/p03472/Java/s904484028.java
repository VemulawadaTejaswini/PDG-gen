import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */

public class Main {
    public static void main(String[] args) {
        InputStream    inputStream    = System.in;
        OutputStream outputStream = System.out;
        InputReader    in                      = new InputReader(inputStream);
        PrintWriter     out                    = new PrintWriter(outputStream);
        Task             solver                = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
        	int N = in.nextInt();
        	int H = in.nextInt();
        	int[] sord  = new int[N];
        	int[] atack = new int[N];
        	int total = 0;
        	int count = 0;
        	int max   = 0;
        	
        	for(int i = 0; i < N; i++) {
        		sord[i]  = in.nextInt();
        		atack[i] = in.nextInt();
        		total += atack[i];
        		max = Math.max(max, sord[i]);
         	}
        	
        	Arrays.sort(atack);
        	
        	loop : while(H > 0) {
        		if(H <= total) {
        			for(int i = atack.length - 1; i >= 0; i--) {
        				H -= atack[i];
        				count++;
        				if(H <= 0) { 
        					break loop;
        				}
        			}
        		}else{
        			H -= max;
        			count++;
        		}
        	}
        	out.println(count);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
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

    }
}

