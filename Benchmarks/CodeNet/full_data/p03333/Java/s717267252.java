import java.io.*;
import java.util.*;

public class Main {
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int n=in.nextInt();
		List<Seg> ss = new ArrayList<Seg>();
		for(int i=0; i<n; ++i)
			ss.add(new Seg(in.nextInt(), in.nextInt(), i));
		long ans=0;
		TreeSet<Seg> ts1 = new TreeSet<Seg>(new Comparator<Seg>() {
			public int compare(Seg a, Seg b) {
				return a.b==b.b?a.i-b.i:a.b-b.b;
			}
		});
		ts1.addAll(ss);
		TreeSet<Seg> ts2 = new TreeSet<Seg>(new Comparator<Seg>() {
			public int compare(Seg a, Seg b) {
				return a.a==b.a?a.i-b.i:b.a-a.a;
			}
		});
		ts2.addAll(ss);
		int cl=0;
		while(!ts1.isEmpty()) {
			Seg a=ts1.first(), b=ts2.first();
			int pa=0, pb=0;
			if(cl<a.a)
				pa=a.a-cl;
			else if(cl>a.b)
				pa=cl-a.b;
			if(cl<b.a)
				pb=b.a-cl;
			else if(cl>b.b)
				pb=cl-b.b;
			if(pa>pb) {
				ans+=pa;
				cl=Math.min(Math.max(cl, a.a), a.b);
				ts1.remove(a);
				ts2.remove(a);
			} else {
				ans+=pb;
				cl=Math.min(Math.max(cl, b.a), b.b);
				ts2.remove(b);
				ts1.remove(b);
			}
//			System.out.println(ans);
		}
		out.println(ans+Math.abs(cl));
		out.close();
	}
	
	static class Seg {
		int a, b, i;
		Seg(int a, int b, int i) {
			this.a=a;
			this.b=b;
			this.i=i;
		}
	}
	
	static class StdIn {
    	final private int BUFFER_SIZE = 1 << 16;
    	private DataInputStream din;
    	private byte[] buffer;
    	private int bufferPointer, bytesRead;
    	public StdIn() {
    		din = new DataInputStream(System.in);
    		buffer = new byte[BUFFER_SIZE];
    		bufferPointer = bytesRead = 0;
    	}
    	public StdIn(InputStream in) {
    		try{
    			din = new DataInputStream(in);
    		} catch(Exception e) {
    			throw new RuntimeException();
    		}
    		buffer = new byte[BUFFER_SIZE];
    		bufferPointer = bytesRead = 0;
    	}
    	public int nextInt() {
    		int ret = 0;
    		byte c = read();
    		while (c <= ' ')
    			c = read();
    		boolean neg = (c == '-');
    		if (neg)
    			c = read();
    		do
    			ret = ret * 10 + c - '0';
    		while ((c = read()) >= '0' && c <= '9');

    		if (neg)
    			return -ret;
    		return ret;
    	}
    	public int[] readIntArray(int n) {
    		int[] ar = new int[n];
    		for(int i=0; i<n; ++i)
    			ar[i]=nextInt();
    		return ar;
    	}
    	private void fillBuffer() throws IOException {
    		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
    		if (bytesRead == -1)
    			buffer[0] = -1;
    	}
    	private byte read() {
    		try{
    			if (bufferPointer == bytesRead)
    				fillBuffer();
    			return buffer[bufferPointer++];
    		} catch(IOException e) {
    			throw new RuntimeException();
    		}
    	}
    	public void close() throws IOException {
    		if (din == null)
    			return;
    		din.close();
    	}
    }
}