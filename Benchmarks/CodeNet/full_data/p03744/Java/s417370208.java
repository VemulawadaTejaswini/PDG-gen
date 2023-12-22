
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.Entry;

import static java.util.Arrays.*;

public class Main {
	private static final int mod = (int)1e9+7;

	final Random random = new Random(0);
	final IOFast io = new IOFast();

	/// MAIN CODE
	public void run() throws IOException {
		int TEST_CASE = 1;
		while(TEST_CASE-- != 0) {
			int n = io.nextInt();
			int l = io.nextInt();
			SplayTreeIndex tree = new SplayTreeIndex();
			for (int i = 0; i < n; i++) {
				int t = io.nextInt();
				int v = io.nextInt();
				tree.insert(t, v);
				int less = (int)tree.root.tv - l;
				while (less > 0) {
					SplayTreeIndex.Node[] nodes = tree.separate(1, tree.getCount(tree.root) - 1);
					if (nodes[0].tv < less) {
						nodes[0].tv -= less;
						tree.root = tree.merge(nodes[0], nodes[1]);
					} else {
						less -= nodes[0].tv;
					}
				}
				io.out.printf("%.10f\n", tree.root.tv);
			}
		}
	}
	
	static class SplayTreeIndex {
		Node root;

		static int getCount(Node n) { return n == null ? 0 : n.count; }
		static Node getLeft(Node n) { return n == null ? null : n.getLeft(); }
		static Node getRight(Node n) { return n == null ? null : n.getRight(); }

		// insert index value
		void insert(int t, int v) {
			insert(new Node(t, v, null));
		}
		void insert(Node insertNode) {
			if(root == null) { root = insertNode; return; }
			Node node = root;
			while(node != null) {
				node.pushDown();
				if(node.t > insertNode.t) {
					if (node.left == null) { Node.linkLeft(insertNode, node); break; }
					node = node.left;
				}
				else {
					if (node.right == null) { Node.linkRight(insertNode, node); break; }
					node = node.right;
				}
			}
			root = insertNode.splay();
		}

		// index subtree node
		Node find(Node node, int index) {
			while(node != null) {
				node.pushDown();
				if(getCount(node.getLeft()) > index) { node = node.getLeft(); }
				else if(getCount(node.getLeft()) == index) { return root = node.splay(); }
				else { index -= getCount(node.getLeft()) + 1; node = node.getRight(); }
			}
			return null;
		}

		Node find(int index) {
			return find(root, index);
		}

		// remove index
		void remove(final int index) {
			if(index < 0 || getCount(root) <= index) {
				throw new RuntimeException();
			}

			final Node node = find(index);
			final Node nl = Node.cut(node.getLeft());
			final Node nr = Node.cut(node.getRight());

			root = Node.merge(nl, nr);
		}

		final Node[] sep = new Node[3];

		// separate [0,l),[l,r],(r,..)
		Node[] separate(int l, int r) {
			final Node left = Node.cut(getLeft(find(l)));
			final Node mid = find(r - l);
			final Node right = Node.cut(getRight(mid));

			sep[0] = left;
			sep[1] = mid;
			sep[2] = right;

			return sep;
		}
		
		// cut from SplayTree [0, i)
		Node cut(int i) {
			return Node.cut(getLeft(find(i)));
		}
		
		// [l, r] -> [i, i + r - l]
		// [l1, r1] <-> [l2, r2], r1 < l2
		void swap(int l1, int r1, int l2, int r2) {
			Node left2 = Node.cut(getLeft(find(l2)));
			final Node mid2 = find(r2 - l2);
			Node right2 = Node.cut(getRight(mid2));

			root = left2;
			Node left1 = Node.cut(getLeft(find(l1)));
			final Node mid1 = find(r1 - l1);
			Node right1 = Node.cut(getRight(mid1));

			root = merge(left1, mid2, right1, mid1, right2);
		}
		
		Node merge(Node... nodes) {
			Node res = null;
			for(Node n : nodes) res = Node.merge(res, n);
			return res;
		}
		
		// sum [l,r]
		double temp() {
			return root.tt;
		}

		static class Node {
			int t, v, count;
			double tt, tv;
			Node left, right, parent;

			void update() {
				count = 1;
				tt = t;
				tv = v;
				if(getLeft() != null) {
					count += left.count;
					tt = (tt * left.tv + left.tt * tv) / (tv + left.tv);
					tv += left.tv;
				}
				if(getRight() != null) {
					count += right.count;
					tt = (tt * right.tv + right.tt * tv) / (tv + right.tv);
					tv += right.tv;
				}
			}

			// eval lazy value
			Node pushDown() {
				return this;
			}

			Node getLeft() { pushDown(); return left; }
			Node getRight() { pushDown(); return right; }

			// merge two node. left, right
			static Node merge(final Node nl, final Node nr) {
				if(nl == null) return nr;
				if(nr == null) return nl;
				nl.splay();
				nr.splay();
				final Node leftMaxNode = nl.maxNode();
				Node.linkRight(nr, leftMaxNode);
				return leftMaxNode;
			}

			// p is parent of n. n is left child of p.
			static void linkLeft(final Node n, final Node p) {
				if(p != null) { p.pushDown(); cut(p.getLeft()); p.left = n; }
				if(n != null) { n.parent = p; }
				if(p != null) { p.update(); }
			}

			// p is parent of n. n is right child of p.
			static void linkRight(final Node n, final Node p) {
				if(p != null) { p.pushDown(); cut(p.getRight()); p.right = n; }
				if(n != null) { n.parent = p; }
				if(p != null) { p.update(); }
			}

			// cut n and parent of n.
			static Node cut(final Node n) {
				if(n == null || n.parent == null) { return n; }
				n.parent.pushDown();
				if(n.parent.left == n) {
					n.parent.left = null;
				}
				else {
					n.parent.right = null;
				}
				n.parent.update();
				n.parent = null;
				return n;
			}

			public Node(int t, int v, Node parent) {
				this.t = t;
				this.v = v;
				this.parent = parent;
				update();
			}

			void rotateRight() {
				final Node x = this;
				final Node p = x.parent;
				final Node g = p.parent;
//				if(g != null) g.pushDown();
				p.pushDown();
				x.pushDown();
				p.left = x.right;
				if(x.right != null) { x.right.parent = p; }
				p.parent = x;
				x.right = p;
				x.parent = g;
				p.update();
				x.update();
				if(g != null) {
					if(g.left == p) g.left = x;
					else if(g.right == p) g.right = x;
//					g.update();
				}
			}

			void rotateLeft() {
				final Node x = this;
				final Node p = x.parent;
				final Node g = p.parent;
//				if(g != null) g.pushDown();
				p.pushDown();
				x.pushDown();
				p.right = x.left;
				if(x.left != null) { x.left.parent = p; }
				p.parent = x;
				x.left = p;
				x.parent = g;
				p.update();
				x.update();
				if(g != null) {
					if(g.left == p) g.left = x;
					else if(g.right == p) g.right = x;
//					g.update();
				}
			}

			public Node splay() {
				final Node x = this;
				while(x.parent != null) {
					final Node p = x.parent;
					if(p.parent == null) {
						// zig step
						if(p.getLeft() == x) { x.rotateRight(); }
						else { x.rotateLeft(); }
					}
					else {
						final Node g = p.parent;
						// zig-zig step / zig-zag step
						if(g.getLeft() == p) {
							if(p.getLeft() == x) { p.rotateRight(); x.rotateRight(); }
							else { x.rotateLeft(); x.rotateRight(); }
						}
						else {
							if(p.getLeft() == x) { x.rotateRight(); x.rotateLeft(); }
							else { p.rotateLeft(); x.rotateLeft(); }
						}
					}
				}
				return x;
			}

			Node maxNode() {
				Node n = this;
				while(true) {
					n.pushDown();
					if(n.right == null) break;
					n = n.right;
				}
				return n.splay();
			}

			Node minNode() {
				Node n = this;
				while(true) {
					n.pushDown();
					if(n.left == null) break;
					n = n.left;
				}
				return n.splay();
			}
		}
	}
	
	
	/// TEMPLATE
	static int gcd(int n, int r) { return r == 0 ? n : gcd(r, n%r); }
	static long gcd(long n, long r) { return r == 0 ? n : gcd(r, n%r); }
	
	static <T> void swap(T[] x, int i, int j) { T t = x[i]; x[i] = x[j]; x[j] = t; }
	static void swap(int[] x, int i, int j) { int t = x[i]; x[i] = x[j]; x[j] = t; }

	void printArrayLn(int[] xs) { for(int i = 0; i < xs.length; i++) io.out.print(xs[i] + (i==xs.length-1?"\n":" ")); }
	void printArrayLn(long[] xs) { for(int i = 0; i < xs.length; i++) io.out.print(xs[i] + (i==xs.length-1?"\n":" ")); }
	
	static void dump(Object... o) { System.err.println(Arrays.deepToString(o)); } 
	
	void main() throws IOException {
		//		IOFast.setFileIO("rle-size.in", "rle-size.out");
		try { run(); }
		catch (EndOfFileRuntimeException e) { }
		io.out.flush();
	}
	public static void main(String[] args) throws IOException { new Main().main(); }
	
	static class EndOfFileRuntimeException extends RuntimeException {
		private static final long serialVersionUID = -8565341110209207657L; }

	static
	public class IOFast {
		private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		private PrintWriter out = new PrintWriter(System.out);

		void setFileIn(String ins) throws IOException { in.close(); in = new BufferedReader(new FileReader(ins)); }
		void setFileOut(String outs) throws IOException { out.flush(); out.close(); out = new PrintWriter(new FileWriter(outs)); }
		void setFileIO(String ins, String outs) throws IOException { setFileIn(ins); setFileOut(outs); }

		private static int pos, readLen;
		private static final char[] buffer = new char[1024 * 8];
		private static char[] str = new char[500*8*2];
		private static boolean[] isDigit = new boolean[256];
		private static boolean[] isSpace = new boolean[256];
		private static boolean[] isLineSep = new boolean[256];

		static { for(int i = 0; i < 10; i++) { isDigit['0' + i] = true; } isDigit['-'] = true; isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true; isLineSep['\r'] = isLineSep['\n'] = true; }
		public int read() throws IOException { if(pos >= readLen) { pos = 0; readLen = in.read(buffer); if(readLen <= 0) { throw new EndOfFileRuntimeException(); } } return buffer[pos++]; }
		public int nextInt() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); int i = 0; int ret = 0; if(str[0] == '-') { i = 1; } for(; i < len; i++) ret = ret * 10 + str[i] - '0'; if(str[0] == '-') { ret = -ret; } return ret; }
		public long nextLong() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); int i = 0; long ret = 0; if(str[0] == '-') { i = 1; } for(; i < len; i++) ret = ret * 10 + str[i] - '0'; if(str[0] == '-') { ret = -ret; } return ret; }
		public char nextChar() throws IOException { while(true) { final int c = read(); if(!isSpace[c]) { return (char)c; } } }
		int reads(int len, boolean[] accept) throws IOException { try { while(true) { final int c = read(); if(accept[c]) { break; } if(str.length == len) { char[] rep = new char[str.length * 3 / 2]; System.arraycopy(str, 0, rep, 0, str.length); str = rep; } str[len++] = (char)c; } } catch(EndOfFileRuntimeException e) { ; } return len; }
		int reads(char[] cs, int len, boolean[] accept) throws IOException { try { while(true) { final int c = read(); if(accept[c]) { break; } cs[len++] = (char)c; } } catch(EndOfFileRuntimeException e) { ; } return len; }
		public char[] nextLine() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isLineSep); try { if(str[len-1] == '\r') { len--; read(); } } catch(EndOfFileRuntimeException e) { ; } return Arrays.copyOf(str, len); }
		public String nextString() throws IOException { return new String(next()); }
		public char[] next() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); return Arrays.copyOf(str, len); }
//		public int next(char[] cs) throws IOException { int len = 0; cs[len++] = nextChar(); len = reads(cs, len, isSpace); return len; }
		public double nextDouble() throws IOException { return Double.parseDouble(nextString()); }
		public long[] nextLongArray(final int n) throws IOException { final long[] res = new long[n]; for(int i = 0; i < n; i++) { res[i] = nextLong(); } return res; }
		public int[] nextIntArray(final int n) throws IOException { final int[] res = new int[n]; for(int i = 0; i < n; i++) { res[i] = nextInt(); } return res; }
		public int[][] nextIntArray2D(final int n, final int k) throws IOException { final int[][] res = new int[n][]; for(int i = 0; i < n; i++) { res[i] = nextIntArray(k); } return res; }
		public int[][] nextIntArray2DWithIndex(final int n, final int k) throws IOException { final int[][] res = new int[n][k+1]; for(int i = 0; i < n; i++) { for(int j = 0; j < k; j++) { res[i][j] = nextInt(); } res[i][k] = i; } return res; }
		public double[] nextDoubleArray(final int n) throws IOException { final double[] res = new double[n]; for(int i = 0; i < n; i++) { res[i] = nextDouble(); } return res; }
	}
}
