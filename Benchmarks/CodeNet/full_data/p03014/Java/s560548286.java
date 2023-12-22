import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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
    	static int U = 0;
    	static int D = 1;
    	static int L = 2;
    	static int R = 3;
    	
    	int H, W;
    	char[][] map;
    	int[][][] idx;
    	
        void solve(InputReader in, PrintWriter out) {
        	H = in.nextInt();
        	W = in.nextInt();
        	map = new char[H + 2][W + 2];
        	for (int i = 0; i < H + 2; ++i) {
        		if (i == 0 || i == H + 1) {
        			for (int j = 0; j < W + 2; ++j) map[i][j] = '#';
        		} else {
        			map[i] = ("#" + in.next() + "#").toCharArray();
        		}
        	}
        	
        	idx = new int[H + 2][W + 2][4];
        	for (int i = 0; i < H + 2; ++i) {
        		for (int j = 0; j < W + 2; ++j) {
        			idx[i][j][U] = 0; 
        			idx[i][j][L] = 0; 
        			idx[i][j][D] = H + 1; 
        			idx[i][j][R] = W + 1; 
        		}
        	}
        	
        	for (int i = 1; i <= H; ++i) {
        		for (int j = 1; j <= W; ++j) {
        			if (map[i][j] == '#') {
        				idx[i][j][L] = j;
        			} else {
        				idx[i][j][L] = idx[i][j - 1][L];
        			}
        		}
        		for (int j = W; j >= 1; --j) {
        			if (map[i][j] == '#') {
        				idx[i][j][R] = j;
        			} else {
        				idx[i][j][R] = idx[i][j + 1][R];
        			}
        		}
        	}
        	
        	for (int j = 1; j <= W; ++j) {
        		for (int i = 1; i <= H; ++i) {
        			if (map[i][j] == '#') {
        				idx[i][j][U] = i;
        			} else {
        				idx[i][j][U] = idx[i - 1][j][U];
        			}
        		}
        		for (int i = H; i >= 1; --i) {
        			if (map[i][j] == '#') {
        				idx[i][j][D] = i;
        			} else {
        				idx[i][j][D] = idx[i + 1][j][D];
        			}
        		}
        	}
        	
        	int ans = Integer.MIN_VALUE;
        	for (int i = 1; i <= H; ++i) {
        		for (int j = 1; j <= W; ++j) {
        			if (map[i][j] == '.') {
        				ans = Math.max(ans, 
        						idx[i][j][D] - idx[i][j][U] + idx[i][j][R] - idx[i][j][L] - 3);
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