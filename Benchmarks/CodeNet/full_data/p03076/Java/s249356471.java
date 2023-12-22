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

class Main {
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
    	int ans = Integer.MAX_VALUE;
    	
        void solve(InputReader in, PrintWriter out) {
        	Integer[] menu = {
        		in.nextInt(),
        		in.nextInt(),
        		in.nextInt(),
        		in.nextInt(),
        		in.nextInt()
        	};
        	PatternUtils<Integer> pt = new PatternUtils<>(Arrays.asList(menu));
        	
        	for (List<Integer> list : pt.permutation(5)) {
        		int fin = 0;
        		for (int t : list) {
        			fin += (10 - fin % 10) % 10 + t;
        		}
        		ans = Math.min(fin, ans);
        	}
        	
        	out.println(ans);
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        long[] nextLongArray(int n) {
        	long[] arr = new long[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextLong();
        	}
        	return arr;
        }
    }
}
