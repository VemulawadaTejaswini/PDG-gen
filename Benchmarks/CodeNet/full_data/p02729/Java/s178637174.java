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
    static int binarySearch(int[]arr, int target) {
        int start = 0, end = arr.length - 1;      
        int ans = -1;  
        while (start <= end) {  
            int mid = start + (end-start) / 2;   
            if (arr[mid] <= target) {  
                start = mid + 1;  
            }   
            else {  
                ans = mid;  
                end = mid - 1;  
            }  
        }  
        return ans;  
    } 
//    static int ans = 0;
//    static void combinationUtil(int arr[], int n, int r, int index, 
//            int data[], int i, int l ,int rr, int diff) 
//{ 
//// Current combination is ready to be printed, print it 
//if (index == r) 
//{ 
//	int sum = 0;
//	for (int j=0; j<r; j++) 
//		sum+=data[j] ;
//if(sum>=l&&sum<=rr&&data[data.length-1]-data[0]>=diff) ans++; 
//return; 
//} 
//if (i >= n) 
//return; 
//data[index] = arr[i]; 
//combinationUtil(arr, n, r, index+1, data, i+1, l, rr, diff); 
//combinationUtil(arr, n, r, index, data, i+1, l, rr, diff); 
//} 
//static void printCombination(int arr[], int n, int r, int l, int rr, int diff) 
//{  
//	int data[]=new int[r];  
//	combinationUtil(arr, n, r, 0, data, 0, l, rr, diff); 
//} 
    static long NcR(int n, int r) { 
    	  
        // p holds the value of n*(n-1)*(n-2)...,  
        // k holds the value of r*(r-1)...  
        long p = 1, k = 1; 
  
        // C(n, r) == C(n, n-r),  
        // choosing the smaller value  
        if (n - r < r) { 
            r = n - r; 
        } 
  
        if (r != 0) { 
            while (r > 0) { 
                p *= n; 
                k *= r; 
  
                // gcd of p, k  
                long m = __gcd(p, k); 
  
                // dividing by gcd, to simplify product  
                // division by their gcd saves from the overflow  
                p /= m; 
                k /= m; 
  
                n--; 
                r--; 
            } 
  
            // k should be simplified to 1  
            // as C(n, r) is a natural number  
            // (denominator should be 1 ) .  
        } else { 
            p = 1; 
        } 
  
        // if our approach is correct p = ans and k =1  
        return p;
    } 
  
    static long __gcd(long n1, long n2) { 
        long gcd = 1; 
  
        for (int i = 1; i <= n1 && i <= n2; ++i) { 
            // Checks if i is factor of both integers 
            if (n1 % i == 0 && n2 % i == 0) { 
                gcd = i; 
            } 
        } 
        return gcd; 
    } 
	public static void main(String[] args) throws IOException {
		try {
			BufferInput in = new BufferInput();
			StringBuilder sb = new StringBuilder();
//			int t = in.nextInt();
//			while(t-->0) {
//			}
//			System.out.println(sb);
			int n = in.nextInt();
			int m = in.nextInt();
			long sum = NcR(n ,2)+NcR(m, 2);
			System.out.println(sum);
			
			
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