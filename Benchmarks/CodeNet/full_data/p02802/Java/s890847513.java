
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		int i = 0;
//		int t = in.nextInt();
//		for (; i < t; i++)
		solver.solve(i, in, out);

		out.close();

	}

	static class Task {

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			int a1 = 0, a2 = 0;
			ArrayList<Integer> al1 = new ArrayList<Integer>();
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			boolean flag[] = new boolean[n + 1];
			int aci[]=new int[n+1];
			for (int i = 0; i < m; i++) {
				al1.add(in.nextInt());
				al2.add(((in.next().equals("AC"))?1:0));
			}
			for (int i = 0; i < m; i++) {
				if(al2.get(i)==1&&!flag[al1.get(i)]) {
					aci[al1.get(i)]=i;
					flag[al1.get(i)]=true;
					a1++;
				}
			}
			for (int i = 0; i < m; i++) {
				if(al2.get(i)==0&&aci[al1.get(i)]>i) {
					a2++;
				}
			}
			System.out.println(a1 + " " + a2);

		}

		static long modInverse(long a, int m) {
			long g = gcd(a, m);
			if (g != 1) {
				System.out.println("Inverse doesn't exist");
				return 0;
			} else {
				// If a and m are relatively prime, then modulo inverse
				// is a^(m-2) mode m
				return power(a, m - 2, m);
			}
		}

		// To compute x^y under modulo m
		static long power(long x, long y, long m) {
			if (y == 0)
				return 1;

			long p = power(x, y / 2, m) % m;
			p = (p * p) % m;

			if (y % 2 == 0)
				return p;
			else
				return (x * p) % m;
		}

		// Function to return gcd of a and b
		static long gcd(long a, long b) {
			if (a == 0)
				return b;
			return gcd(b % a, a);
		}

		static int highestPowerOf2(int n) {
			return (n & (~(n - 1)));
		}

	}
	// template code

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

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

}

class TCS implements Comparable<TCS>, Comparator<TCS> {
	long i1, i2;
	int flag;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i1:" + i1 + "  i2:" + i2;
	}

	TCS(long i1, long i2) {
		this.i1 = i1;
		this.i2 = i2;
	}

	@Override
	public int compareTo(TCS o) {
		// TODO Auto-generated method stub
		return compare(this, o);
	}

	@Override
	public int compare(TCS o1, TCS o2) {
		// TODO Auto-generated method stub
		return (int) ((o1.i1 == o2.i1) ? o1.i2 - o2.i2 : o1.i1 - o2.i1);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}

class Pair implements Comparator<Pair>, Comparable<Pair> {
	int key, value;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "key:" + key + " value: " + value;
	}

	public Pair(int i, int j) {
		key = i;
		value = j;

	}

	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		return this.key - o.key;
	}

}
