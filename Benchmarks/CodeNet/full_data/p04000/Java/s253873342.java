import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int h=scanner.nextInt();
		int w=scanner.nextInt();
		int n=scanner.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		Set<Point> blacks=new HashSet<>(); 
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt()-1;
			b[i]=scanner.nextInt()-1;
			blacks.add(new Point(a[i],b[i]));
		}
		Map<Point,Integer>map=new HashMap<>();
		for(int i=0;i<n;i++) {
			for(int y=-2;y<=0;y++) {
				for(int x=-2;x<=0;x++) {
					int tar_a=a[i]+y;
					int tar_b=b[i]+x;
					if(0<=tar_a&&tar_a<=h-3&&0<=tar_b&&tar_b<=w-3) {
						int cnt=0;
						for(int q=tar_a;q<tar_a+3;q++) {
							for(int p=tar_b;p<tar_b+3;p++) {
								if(blacks.contains(new Point(q,p))) {
									cnt++;
								}
							}
						}
						map.put(new Point(tar_a,tar_b), cnt);
					}
				}
			}
		}
		int[] ans=new int[9+1];
		int cnt=0;
		for(int val:map.values()) {
			ans[val]++;
			cnt++;
		}
		StringBuilder sb=new StringBuilder();
		sb.append((long)(h-2)*(w-2)-cnt+"\n");
		for(int i=1;i<10;i++) {
			sb.append(ans[i]+"\n");
		}
		System.out.print(sb);
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        if (!hasNext()) throw new NoSuchElementException();
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
    public double nextDouble() { return Double.parseDouble(next());}
}
