import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
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
    	int N, K;
    	List<List<Integer>> edges = new ArrayList<>();
    	
        void solve(InputReader in, PrintWriter out) {
            // write your code here
        	N = in.nextInt();
        	K = in.nextInt();
        	
        	int cnt = 0;
        	if ((N - 2)*(N - 1)/2 < K) {
        		out.println(-1);
        		return;
        	} else {
        		cnt += (N - 2)*(N - 1)/2;
        	}
        	
        	Integer[] v = new Integer[N - 1];
        	for (int i = 2; i <= N; ++i) {
        		v[i - 2] = i;
        		Integer[] e = {1, i};
        		edges.add(Arrays.asList(e));
        	}
        	PatternUtils<Integer> pt = new PatternUtils<>(Arrays.asList(v));
        	
        	for (List<Integer> pair : pt.combination(2)) {
        		if (cnt == K) {
        			break;
        		} else {
        			edges.add(pair);
        			cnt--;
        		}
        	}
        	
        	out.println(edges.size());
        	for (List<Integer> e : edges) out.println(e.get(0) + " " + e.get(1));
        }
        
    }
    
    static class PatternUtils<E> {
    	private int[] indexes;
    	private List<E> original;
    	private List<List<E>> pattern;
    	
    	public PatternUtils(List<E> l) {
    		this.original = l;
    		this.indexes = new int[original.size()];
    		for (int i = 0; i < original.size(); ++i) indexes[i] = i;
    	}
    	
    	void search(int[] perm, Stack<E> stack, int rem) {
    		if (rem == 0 || perm.length == 0) {
    			pattern.add(new ArrayList<>(stack));
    		} else {
    			int[] nperm = Arrays.copyOfRange(perm, 1, perm.length);
    			for (int i = 0; i < perm.length; ++i) {
    				stack.push(original.get(perm[i]));
    				search(nperm, stack, rem - 1);
    				if (i < nperm.length) nperm[i] = perm[i];
    				stack.pop();
    			}
    		}
    	}
    	
    	List<List<E>> permutation(int n) {
    		pattern = new ArrayList<>();
    		
    		search(indexes, new Stack<>(), n);
    		
    		return pattern;
    	}
    	
    	void csearch(int[] perm, Stack<E> stack, int rem, int prevIdx) {
    		if (rem == 0 || perm.length == 0) {
    			pattern.add(new ArrayList<>(stack));
    		} else {
    			int[] nperm = Arrays.copyOfRange(perm, 1, perm.length);
    			for (int i = 0; i < perm.length; ++i) {
    				stack.push(original.get(perm[i]));
    				if (perm[i] > prevIdx) 
    					csearch(nperm, stack, rem - 1, perm[i]);
    				if (i < nperm.length) nperm[i] = perm[i];
    				stack.pop();
    			}
    		}
    	}
    	
    	List<List<E>> combination(int n) {
    		pattern = new ArrayList<>();
    		
    		csearch(indexes, new Stack<>(), n, -1);
    		
    		return pattern;
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
