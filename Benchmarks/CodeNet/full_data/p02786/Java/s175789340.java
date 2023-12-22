import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
public class Main {
	static void merge(long arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 

        long L[] = new long [n1]; 
        long R[] = new long [n2]; 
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
    static void sort(long arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    }
    static void revOrder(long[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			long t = arr[0];
			arr[0] = arr[arr.length-i-1];
			arr[arr.length-i-1] = t;
		}
	}
    static long fun(long n, long count) {
    	if(n==2) return 3;
    	return n/2*fun(n/2, count*2)+count;
    }
	public static void main(String[] args) {
		try {
			BufferInput in = new BufferInput();
			StringBuilder sb = new StringBuilder();
			long n = in.nextLong();
			//long ans = fun(n, 1);
			TreeMap<Long, Long> map = new TreeMap<>();
			long cnt = 1;
			while(n>=1) {
				map.put(n, cnt);
				n/=2;
				cnt*=2;
			}
			long ans = 0;
			for(long i:map.keySet()) {
				ans+=map.get(i);
			}
			System.out.println(ans);
		}catch(Exception e) {}

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
		
		public int[] nextIntArray(int n) throws IOException {
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = nextInt();
			}
			return arr;
		}
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
		
		public long[] nextLongArray(int n) throws IOException {
			long arr[] = new long[n];
			for(int i = 0; i < n; i++){
				arr[i] = nextLong();
			}
			return arr;
		}
		
		public char nextChar() throws IOException{
			byte c = read();
			while(Character.isWhitespace(c)){
				c = read();
			}
			return (char) c;	
		}
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
		public double[] nextDoubleArray(int n) throws IOException {
			double arr[] = new double[n];
			for(int i = 0; i < n; i++){
				arr[i] = nextDouble();
			}
			return arr;
		}
		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
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
}
