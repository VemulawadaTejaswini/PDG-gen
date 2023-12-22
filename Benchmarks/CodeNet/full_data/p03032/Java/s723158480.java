import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
    	int N, K, ans = 0;
    	ArrayDeque<Integer> deque = new ArrayDeque<>();
    	PriorityQueue<Integer> atHand;
    	
    	void setMax() {
    		for (int l = 0; l <= K; ++l) {
    			int r = K - l;
    			for (int get_l = 0; get_l <= Math.min(l, N); ++get_l) {
    				for (int get_r = 0; get_r <= Math.min(r, N - get_l); ++get_r) {
    					Deque<Integer> dq = deque.clone();
    					atHand = new PriorityQueue<>();
    					int back_l = l - get_l;
    					int back_r = r - get_r;
    					
	    				for (int t = 0; t < get_l; ++t) {
	    					atHand.add(dq.pollFirst());
	    				}
	    				
						for (int t = 0; t < get_r; ++t) {
							atHand.add(dq.pollLast());
						}
						
						for (int t = 0; t < back_l + back_r; ++t) {
							if (!atHand.isEmpty() && atHand.peek() < 0) atHand.poll();
						}
	    				
	    				int sum = 0;
	    				for (int item : atHand) {
	    					sum += item;
	    				}
	    				ans = Math.max(ans, sum);
    					
    				}
    			}
    		}
    	}
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	K = in.nextInt();
        	for (int i = 0; i < N; ++i) {
        		deque.add(in.nextInt());
        	}
        	
        	setMax();
        	out.println(ans);
        }
        
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
