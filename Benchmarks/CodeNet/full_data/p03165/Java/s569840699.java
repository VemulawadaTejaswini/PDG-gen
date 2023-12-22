import java.util.*;
import java.util.Map.Entry;


import java.io.*;
import java.math.BigInteger;
/*
-> Written by <-
  -----------
 |J_O_B_E_E_L|
 |___________|
 |    ___    |
 |   (^_^)   |
 |  /( | )\  |
 |____|_|____|
*/


public class Test {
	static int [][] memo;
	static char [] ch1,ch2;
	static int n1,n2;
	static StringBuilder sb;
	static int dp(int i,int j) {
		if(i==n1 || j==n2) return 0;
		if(memo[i][j]!=-1) return memo[i][j];
		if(ch1[i]==ch2[j]) return memo[i][j]=1+dp(i+1, j+1);
		else return memo[i][j]=Math.max(dp(i+1, j),Math.max(dp(i, j+1),dp(i+1, j+1)));
	}
	static void trace(int i,int j) {
		if(i==n1 || j==n2) return ;
		
		if(ch1[i]==ch2[j]) {
			sb.append(ch1[i]);
			trace(i+1, j+1);
		}
		int ans=dp(i, j);
		if(ans==dp(i+1, j+1)) {
			trace(i+1, j+1);
		}else if(ans==dp(i+1, j)) {
			trace(i+1, j);
		}else if(ans==dp(i, j+1)) {
			trace(i, j+1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		ch1=sc.next().toCharArray();
		ch2=sc.next().toCharArray();
		n1=ch1.length; 
		n2=ch2.length;
		memo=new int [n1][n2];
		for(int [] a:memo) Arrays.fill(a,-1);
		sb=new StringBuilder();
		dp(0, 0);
		trace(0, 0);
		pw.println(sb.length()==0 ? "The answer is (an empty string).":sb);
		pw.flush();
		pw.close();
	}
	
	
	
    static class Scanner {
    	 
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int curbuf;
        private int lenbuf;
 
        public Scanner(InputStream in) {
            this.in = in;
            this.curbuf = this.lenbuf = 0;
        }
 
        public boolean hasNextByte() {
            if (curbuf >= lenbuf) {
                curbuf = 0;
                try {
                    lenbuf = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0)
                    return false;
            }
            return true;
        }
 
        private int readByte() {
            if (hasNextByte())
                return buffer[curbuf++];
            else
                return -1;
        }
 
        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
 
        private void skip() {
            while (hasNextByte() && isSpaceChar(buffer[curbuf]))
                curbuf++;
        }
 
        public boolean hasNext() {
            skip();
            return hasNextByte();
        }
 
        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (!isSpaceChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
 
        public int nextInt() {
            if (!hasNext())
                throw new NoSuchElementException();
            int c = readByte();
            while (isSpaceChar(c))
                c = readByte();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = readByte();
            } while (!isSpaceChar(c));
            return (minus) ? -res : res;
        }
 
        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            int c = readByte();
            while (isSpaceChar(c))
                c = readByte();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = readByte();
            } while (!isSpaceChar(c));
            return (minus) ? -res : res;
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
 
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
        public Integer [] sortedIntArray(int n) {
        	Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            Arrays.sort(a);
            return a;
        }
        public Long [] sortedLongArray(int n) {
        	Long[] a = new Long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            Arrays.sort(a);
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
 
    }
	static Scanner sc = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);
}
