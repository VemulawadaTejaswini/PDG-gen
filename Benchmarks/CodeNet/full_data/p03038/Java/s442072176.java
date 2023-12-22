import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

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
    	int N, M;
    	SortedMap<Long, Long> vAndT = new TreeMap<>(Comparator.reverseOrder());
    	long ans = 0;
    	
        void solve(InputReader in, PrintWriter out) {
            // write your code here
        	N = in.nextInt();
        	M = in.nextInt();
        	
        	for (int i = 0; i < N; ++i) {
        		long v = in.nextLong();
        		long times = vAndT.containsKey(v) ? vAndT.get(v) : 0;
        		vAndT.put(v, times + 1);
        	}
        	
        	for (int i = 0; i < M; ++i) {
        		long times = in.nextLong();
        		long v = in.nextLong();
        		times += vAndT.containsKey(v) ? vAndT.get(v) : 0;
        		vAndT.put(v, times);
        	}
        	
        	int count = 0;
        	for (Map.Entry<Long, Long> e : vAndT.entrySet()) {
        		long v = e.getKey();
        		long times = e.getValue();
        		if (count + times > N) {
        			ans += v*(N - count);
        			break;
        		} else {
        			ans += v*times;
        		}
        		count += times;
        	}
        	
        	out.println(ans);
        }
        
        int lowerBound(long x, Long[] arr) {
            int low = 0, high = arr.length;
            while (low < high - 1) {
                int mid = (low + high) / 2;
                if (x <= arr[mid]) {
                    high = mid;
                } else if (x > arr[mid]) {
                    low = mid;
                }
            }
            return arr[low] < x ? high : low;
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
