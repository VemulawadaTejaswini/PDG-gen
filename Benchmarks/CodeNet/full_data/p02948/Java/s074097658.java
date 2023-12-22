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

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashSet;

class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
		int N = in.nextInt();
		int M = in.nextInt();
		Comparator<Work> comparator = new Comparator<Work>() {
		    @Override
		    public int compare(Work o1, Work o2) {
		        return Integer.compare(o2.B, o1.B);
		    }
		};
		PriorityQueue<Work> queue = new PriorityQueue<Work>(comparator);
		for (int i=0;i<N;i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			queue.add(new Work(A, B));
		}

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=N-1;i>=0;i--) {
			set.add(i);
		}

		int ans = 0;
		int[] flag = new int[M];
		while(!queue.isEmpty()) {
			Work rem = queue.poll();
			for (int i : set) {
			// for (int i=M-rem.A;i>=0;i--) {
				if (i>M-rem.A) {
					continue;
				}
				if (flag[i]==1) {
					continue;
				} else {
					flag[i]=1;
					ans+=rem.B;
					break;
				}
			}
		}
		System.out.println(ans);
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

	static class Work {
		public int A;
		public int B;

		public Work(int A, int B) {
			this.A = A;
			this.B = B;
		}
	}
}
