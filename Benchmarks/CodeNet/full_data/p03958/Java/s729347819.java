import java.io.*;
import java.util.*;
public class Main {
	static long MOD = 2 << 29;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int K = sc.nextInt();
		int T = sc.nextInt();
		int[] a = new int[T];
		PriorityQueue<Data> al = new PriorityQueue<Data>();
		for(int i = 0; i < T; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < T; i++) {
			al.add(new Data(a[i],i));
		}
		int count = 0;
		int pre = -1;
		IN:for(int i = 0; i < K; i++) {
			Data f = al.poll();
			//System.out.println(count);
			if(f.id == pre) {
				if(al.size() != 0) {
					Data ff = al.poll();
					pre = ff.id;
					if(ff.count != 1) {
						pre = ff.id;
						ff.count--;
						al.add(ff);
					}
					al.add(f);
				}
				else {
					count++;
					pre = f.id;
					if(f.count != 1) {
						f.count--;
						al.add(f);
					}
					continue IN;
				}
			} else {
				pre = f.id;
				if(f.count != 1) {
					f.count--;
					al.add(f);
				}
				continue IN;
			}
		}
		System.out.println(count);
	}
	static class Data implements Comparable<Data>{
		int count;
		int id;
		Data(int a, int b) {
			count = a;
			id = b;
		}

		@Override
		public int compareTo(Data o) {
			return o.count - this.count;
		}
		
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
    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
}