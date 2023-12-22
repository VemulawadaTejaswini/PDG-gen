
import java.io.*;
import java.util.*;

public class Main {
	 static class FastReader 
	    { 
	        final private int BUFFER_SIZE = 1 << 16; 
	        private DataInputStream din; 
	        private byte[] buffer; 
	        private int bufferPointer, bytesRead; 
	  
	        public FastReader() 
	        { 
	            din = new DataInputStream(System.in); 
	            buffer = new byte[BUFFER_SIZE]; 
	            bufferPointer = bytesRead = 0; 
	        } 
	  
	        public FastReader(String file_name) throws IOException 
	        { 
	            din = new DataInputStream(new FileInputStream(file_name)); 
	            buffer = new byte[BUFFER_SIZE]; 
	            bufferPointer = bytesRead = 0; 
	        } 
	  
	        public String nextLine() throws IOException 
	        { 
	            byte[] buf = new byte[64]; // line length 
	            int cnt = 0, c; 
	            while ((c = read()) != -1) 
	            { 
	                if (c == '\n') 
	                    break; 
	                buf[cnt++] = (byte) c; 
	            } 
	            return new String(buf, 0, cnt); 
	        } 
	  
	        public int nextInt() throws IOException 
	        { 
	            int ret = 0; 
	            byte c = read(); 
	            while (c <= ' ') 
	                c = read(); 
	            boolean neg = (c == '-'); 
	            if (neg) 
	                c = read(); 
	            do
	            { 
	                ret = ret * 10 + c - '0'; 
	            }  while ((c = read()) >= '0' && c <= '9'); 
	  
	            if (neg) 
	                return -ret; 
	            return ret; 
	        } 
	  
	        public long nextLong() throws IOException 
	        { 
	            long ret = 0; 
	            byte c = read(); 
	            while (c <= ' ') 
	                c = read(); 
	            boolean neg = (c == '-'); 
	            if (neg) 
	                c = read(); 
	            do { 
	                ret = ret * 10 + c - '0'; 
	            } 
	            while ((c = read()) >= '0' && c <= '9'); 
	            if (neg) 
	                return -ret; 
	            return ret; 
	        } 
	  
	        public double nextDouble() throws IOException 
	        { 
	            double ret = 0, div = 1; 
	            byte c = read(); 
	            while (c <= ' ') 
	                c = read(); 
	            boolean neg = (c == '-'); 
	            if (neg) 
	                c = read(); 
	  
	            do { 
	                ret = ret * 10 + c - '0'; 
	            } 
	            while ((c = read()) >= '0' && c <= '9'); 
	  
	            if (c == '.') 
	            { 
	                while ((c = read()) >= '0' && c <= '9') 
	                { 
	                    ret += (c - '0') / (div *= 10); 
	                } 
	            } 
	  
	            if (neg) 
	                return -ret; 
	            return ret; 
	        } 
	  
	        private void fillBuffer() throws IOException 
	        { 
	            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
	            if (bytesRead == -1) 
	                buffer[0] = -1; 
	        } 
	  
	        private byte read() throws IOException 
	        { 
	            if (bufferPointer == bytesRead) 
	                fillBuffer(); 
	            return buffer[bufferPointer++]; 
	        } 
	  
	        public void close() throws IOException 
	        { 
	            if (din == null) 
	                return; 
	            din.close(); 
	        } 
	    } 
	  
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static final long mod = (long)(1e9+7);
	
	//static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		// TODO Auto-generated method stub
		
       int n = sc.nextInt();
       int m = sc.nextInt();
       int[] s = new int[n];
       int[] t = new int[m];
       for(int i=0;i<n;++i) s[i] = sc.nextInt();
       for(int i=0;i<m;++i) t[i] = sc.nextInt();
       long ans = (Count(s,t)%mod+1)%mod;
       out.println(ans);
		out.close();
	}
	
	
	
	 static long Count(int[] s, int[] t)  
	    {  
	        int n1 = s.length;  
	        int n2 = t.length;  
	        long dp[][] = new long [n1+1][n2+1];  
	        int ch1,ch2 ; 
	        
	        for (int i = 0; i <= n1; i++) {  
	            for (int j = 0; j <= n2; j++) {  
	                dp[i][j] = 0;  
	            }  
	        }  
	        
	        
	        for (int i = 1; i <= n1; i++) {  
	        
	             
	            for (int j = 1; j <= n2; j++) {  
	                  
	                ch1 = s[i - 1]; 
	                ch2 = t[j - 1]; 
	                  
	                               
	                if (ch1 == ch2)   
	                    dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j];              
	                else 
	                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j] -   
	                                            dp[i - 1][j - 1];              
	            }  
	        }
			  
	        return dp[n1][n2];  
	    }  
}