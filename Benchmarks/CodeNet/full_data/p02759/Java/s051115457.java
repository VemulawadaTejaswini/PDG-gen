import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 
public class Main { 
	static void merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 

        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    }
	public static void main(String[] args) throws IOException {
		try {
			BufferInput in = new BufferInput();
			StringBuilder sb = new StringBuilder();
//			int t = in.nextInt();
//			while(t-->0) {
//			}
//			System.out.print(sb);
			int n = in.nextInt();
			System.out.println((n+1)/2);
			
		}catch(Exception e) {}
	}
	static void revOrder(long[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			long t = arr[0];
			arr[0] = arr[arr.length-i-1];
			arr[arr.length-i-1] = t;
		}
	}
	
static class BufferInput {
		final private int BUFFER_SIZE = 1 << 16;
		
		private DataInputStream din;
		
		private byte[] buffer;
		
		private int bufferPointer, bytesRead;
		
		public BufferInput() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
 
		public BufferInput(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		public String readLine() throws IOException {
			byte[] buf = new byte[64];
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}
		public String nextString() throws IOException{
			
			// Skip all whitespace characters from the stream
			byte c = read();
			while(Character.isWhitespace(c)){
				c = read();
			}
			
			StringBuilder builder = new StringBuilder();
			builder.append((char)c);
			c = read();
			while(!Character.isWhitespace(c)){
				builder.append((char)c);
				c = read();
			}
			
			return builder.toString();
		}
			
		/**
		 * Reads an integer value.
		 * @return
		 * @throws IOException
		 */
		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
 
			if (neg)
				return -ret;
			return ret;
		}
		
 
		/**
		 * Reads an array of integers.
		 * @return
		 * @throws IOException
		 */
		public int[] nextIntArray(int n) throws IOException {
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = nextInt();
			}
			return arr;
		}
 
 
		/**
		 * Reads a long value.
		 * @return
		 * @throws IOException
		 */
		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		
		
		/**
		 * Reads an array of long integers.
		 * @return
		 * @throws IOException
		 */
		public long[] nextLongArray(int n) throws IOException {
			long arr[] = new long[n];
			for(int i = 0; i < n; i++){
				arr[i] = nextLong();
			}
			return arr;
		}
		
		/**
		 * 
		 * @return
		 * @throws IOException
		 */
		public char nextChar() throws IOException{
			byte c = read();
			while(Character.isWhitespace(c)){
				c = read();
			}
			return (char) c;	
		}
		
 
		/**
		 * Reads a double value.
		 * @return
		 * @throws IOException
		 */
		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
 
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
 
			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}
 
			if (neg)
				return -ret;
			return ret;
		}
 
		/**
		 * Reads an array of double values.
		 * @return
		 * @throws IOException
		 */
		public double[] nextDoubleArray(int n) throws IOException {
			double arr[] = new double[n];
			for(int i = 0; i < n; i++){
				arr[i] = nextDouble();
			}
			return arr;
		}
		
		/**
		 * Fills the buffer from input stream.
		 * 
		 * @throws IOException
		 */
		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
 
		/**
		 * 
		 * @return
		 * @throws IOException
		 */
		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}
 
		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
public static class Pair<U extends Comparable<U>, V extends Comparable<V>> implements
Comparable<Pair<U, V>> {
public final U first;
public final V second;

public Pair(U first, V second) {
this.first = first;
this.second = second;
}

public int compareTo(Pair<U, V> that) {
int value = this.first.compareTo(that.first);
if (value != 0)
return value;
return this.second.compareTo(that.second);
}

@Override
public boolean equals(Object other) {
if (!(other instanceof Pair)) {
return false;
}
Pair that = (Pair<U, V>) other;
return this.first.equals(that.first) && this.second.equals(that.second);
}

@Override
public int hashCode() {
return 31 * (527 + first.hashCode()) + second.hashCode();
}

@Override
public String toString() {
return "(" + first + ", " + second + ")";
}
}

 
}
 