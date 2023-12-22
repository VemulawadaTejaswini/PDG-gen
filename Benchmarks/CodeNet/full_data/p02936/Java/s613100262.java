import java.util.*;
import java.io.*;
 
public class Main{
  static int[] ans;
  static Map<Integer, List<Integer>> map;
  public static void main(String[]args){
    FastScanner sc = new FastScanner();
	PrintWriter out = new PrintWriter(System.out);
    
    int N = Integer.parseInt(sc.next());
    int Q = Integer.parseInt(sc.next());
    ans = new int[N];
    
    map = new HashMap<>();
    for(int i = 0; i < N-1; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      if(map.get(a) == null){
        map.put(a, new ArrayList<Integer>());
        map.get(a).add(b);
      }else{
        map.get(a).add(b);
      }
    }
    
    for(int i = 0; i < Q; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      ans[a-1] += b;
    }
    
    for(int i = N; i > 0; i--){
      if(map.get(i) != null && ans[i-1] != 0){
        func(i-1, ans[i-1], map.get(i));
      }
    }
    
    for(int i = 0; i < N; i++){
      if(i < N-1){
        out.print(ans[i]);
        out.print(" ");
      }else{
        out.println(ans[i]);
        out.flush();
      }
    }
  }
  public static void func(int a, int b, List<Integer> list){
    for(int i = 0; i < list.size(); i++){
      int M = list.get(i);
      ans[M-1] += b;
      if(map.get(M) != null){
        func(M-1, b, map.get(M));
      }
    }
  }
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
 
	private boolean hasNextByte() {
		if (ptr < buflen) return true;
		else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) return false;
		}
		return true;
	}
 
	private byte readByte() {
		if (hasNextByte()) return buffer[ptr++];
		return -1;
	}
 
	private boolean isPrintableChar(byte c) {
		return '!' <= c && c <= '~';
	}
 
	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}
 
	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}
 
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		byte b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
 
	public int nextInt() {
		if (!hasNext()) throw new NoSuchElementException();
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
 
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}