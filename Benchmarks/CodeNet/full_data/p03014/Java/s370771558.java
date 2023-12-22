import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

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
    	int H, W;
    	char[][] map;
    	List<TreeSet<Integer>> obstR = new ArrayList<>();
    	List<TreeSet<Integer>> obstC = new ArrayList<>();
    	
        void solve(InputReader in, PrintWriter out) {
        	H = in.nextInt();
        	W = in.nextInt();
        	map = new char[H][W];
        	for (int i = 0; i < H; ++i) map[i] = in.next().toCharArray();
        	
        	for (int i = 0; i < H; ++i) obstR.add(new TreeSet<>());
        	for (int i = 0; i < W; ++i) obstC.add(new TreeSet<>());
        	
        	for (int i = 0; i < H; ++i) {
        		for (int j = 0; j < W; ++j) {
        			if (map[i][j] == '#') {
        				obstR.get(i).add(j);
        				obstC.get(j).add(i);
        			}
        		}
        	}
        	
        	int ans = Integer.MIN_VALUE;
        	for (int i = 0; i < H; ++i) {
        		for (int j = 0; j < W; ++j) {
        			if (map[i][j] == '.') {
        				int t = 0, b = H - 1, l = 0, r = W - 1;
        				if (obstR.get(i).lower(j) != null) {
        					l = obstR.get(i).lower(j) + 1;
        				}
        				if (obstR.get(i).higher(j) != null) {
        					r = obstR.get(i).higher(j) - 1;
        				}
        				if (obstC.get(j).lower(i) != null) {
        					t = obstC.get(j).lower(i) + 1;
        				}
        				if (obstC.get(j).higher(i) != null) {
        					b = obstC.get(j).higher(i) - 1;
        				}
        				int cur = (b - t + 1) + (r - l + 1) - 1;
        				ans = Math.max(ans, cur);
        			}
        		}
        	}
        	
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
