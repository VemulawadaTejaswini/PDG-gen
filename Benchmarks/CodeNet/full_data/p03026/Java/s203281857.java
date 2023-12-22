import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    	int N, ans = 0;
    	int[] ansList;
    	PriorityQueue<Integer> c = new PriorityQueue<>(Collections.reverseOrder());
    	List<Integer> nodes = new ArrayList<>();
    	boolean[] checked;
    	List<List<Integer>> connectedNodes = new ArrayList<>();
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	ansList = new int[N];
        	
        	for (int i = 0; i < N; ++i) nodes.add(i);
        	
        	checked = new boolean[N];
        	Arrays.fill(checked, false);
        	
        	for (int i = 0; i < N; ++i) {
        		connectedNodes.add(new ArrayList<>()	);
        	}
        	
        	for (int i = 0; i < N - 1; ++i) {
        		int a = in.nextInt() - 1;
        		int b = in.nextInt() - 1;
        		connectedNodes.get(a).add(b);
        		connectedNodes.get(b).add(a);
        	}
        	
        	for (int i = 0; i < N; ++i) {
        		c.add(in.nextInt());
        	}
        	
        	Collections.sort(nodes, (x, y) -> {
        		return connectedNodes.get(y).size() - connectedNodes.get(x).size(); 
        	});
        	
        	for (List<Integer> cn : connectedNodes) {
        		Collections.sort(cn, (x, y) -> {
            		return connectedNodes.get(y).size() - connectedNodes.get(x).size(); 
            	});
        	}
        	
        	int score = c.poll();
        	ansList[nodes.get(0)] = score;
        	checked[nodes.get(0)] = true;
        	for (int node : nodes) {
    			for (int cn : connectedNodes.get(node)) {
    				if (!checked[cn]) {
    					int point = c.poll();
    					ans += point;
    					ansList[cn] = point;
    					checked[cn] = true;
    				}
    			}
        	}
        	
        	out.println(ans);
        	for (int i = 0; i < N; ++i) {
        		out.print(ansList[i]);
        		if (i < N - 1) {
        			out.print(' ');
        		} else {
        			out.println();
        		}
        	}
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
