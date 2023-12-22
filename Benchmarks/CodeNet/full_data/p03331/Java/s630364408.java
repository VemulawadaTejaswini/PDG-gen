import java.io.*;
import java.util.*;

public class Main {
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int n=in.nextInt(), ans=696969;
		for(int a=1; a<n; ++a) {
			int a2=a, b=n-a, ca=0;
			while(a2>0) {
				ca+=a2%10;
				a2/=10;
			}
			while(b>0) {
				ca+=b%10;
				b/=10;
			}
			ans=Math.min(ca, ans);
		}
		out.println(ans);
		out.close();
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