import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main implements Runnable {

	public static void main(String[] args) {

		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

	}

	@Override
	public void run() {
		exec();
	}

	private void exec() {

		int n;
		int q;
		FastScanner sc = new FastScanner(System.in);
		n = sc.nextInt();
		q = sc.nextInt();
		Map<Integer, Point> tree = new TreeMap<>();
		tree.put(1, new Point(1));
		int pa;
		int c;
		for(int i = 0 ; i < n - 1 ; i++) {
			pa = sc.nextInt();
			c = sc.nextInt();
			Point parent = tree.get(pa);
			boolean firstParent = true;
			if(parent == null) {
				parent = new Point(c);
				tree.put(pa, parent);
				firstParent = false;
			}
			Point child = tree.get(c);
			if(child == null) {
				child = new Point(c);
				tree.put(c, child);
			}
			if(firstParent) {
				parent.addChild(child);
			} else {
				child.addChild(parent);
			}
		}
		int p;
		int x;
		for(int i = 0 ; i < q ; i++) {
			p = sc.nextInt();
			x = sc.nextInt();
			Point parent = tree.get(p);
			parent.addCount(x);
		}
		for(Map.Entry<Integer, Point> entry : tree.entrySet()) {
			System.out.println(entry.getValue().getCount());
		}

	}

}

class Point implements Comparable<Point> {

	int number;
	long count = 0;
	List<Point> child = new ArrayList<>();

	public Point(int number) {
		this.number = number;
	}

	public void addChild(Point point) {
		child.add(point);
	}

	public void addCount(int x) {
		count += x;
		for(Point point : child) {
			point.addCount(x);
		}
	}

	public int getNumber() {
		return number;
	}

	public long getCount() {
		return count;
	}

	@Override
	public int compareTo(Point o) {
		return number - o.getNumber();
	}

	@Override
	public boolean equals(Object o) {
		if(number == ((Point)o).getNumber()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return number;
	}

}

class FastScanner {

	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public FastScanner(InputStream in) {
		this.in = in;
	}

	private boolean hasNextByte() {
		if(ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if(hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while(hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

}
