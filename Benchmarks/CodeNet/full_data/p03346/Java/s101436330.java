//Meet Arora 2016055

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;
import java.awt.Point;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /**
     * call this method to initialize reader for InputStream
     */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    /**
     * get next word
     */
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

public class Main {
	public static void main(String[] args) throws IOException {
		Reader.init(System.in);
		int n=Reader.nextInt();
		int[] a=new int[n];
		PriorityQueue<Integer> pq = new PriorityQueue<>(n);
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			a[i] = Reader.nextInt();
			pq.add(a[i]);
			hm.put(a[i], i);
		}

		int count = 0;
		int inc = 0, max_inc = -1;
		int min = pq.remove();
		int min_index = hm.get(min);
		for (int i = 1; i < n; i++) {
			int next = pq.remove();
			int index = hm.get(next);
			if (min_index<index) {
				inc++;
				if (inc > max_inc)
					max_inc = inc;
			}
			else {
				inc = 0;
			}
			min = next;
			min_index = index;
		}

		if (max_inc==-1) {
			max_inc=0;
		}
		count = n-1-max_inc;
		System.out.println(count);
	}
}
