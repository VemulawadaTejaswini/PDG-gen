



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
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.nio.file.Path;
import java.util.Map.*;
public class Main {
     static char [] [] grid;
     static long [][]memo;
     static int r,c;
     static int mod1=7+(int)1e9;
     static long solve(int row,int col) {
    	 if(row==0 && col==0) return 1;
    	 if(row<0 || col<0 || grid[row][col]=='#') return 0;
    	 if(memo[row][col]!=-1) return memo[row][col];
    	 return memo[row][col]=((solve(row-1,col)%mod1)+(solve(row,col-1)%mod1))%mod1;
     }
	public static void main(String[] args) throws IOException{
		r=sc.nextInt(); c=sc.nextInt();
		grid=new char[r][c];
		memo=new long[r][c];
		for(int i=0;i<r;i++) {
			grid[i]=sc.next().toCharArray();
			Arrays.fill(memo[i],-1);
		}
		pw.println(solve(r-1, c-1));
		pw.flush();
        pw.close();
    }
   
	static int p = 31;
	static int m = (int)1e9 + 9;
	static long [] p_pow;
	static long [] hash;
	static void creatp_pow(int n) {
		p_pow=new long [n];
		p_pow[0]=1;
		for(int i=1;i<n;i++)
			p_pow[i]=(p_pow[i-1]*p)%m;
	}
	static void creatHash(char [] ch) {
		hash=new long [ch.length+1];
		for(int i=0;i<ch.length;i++)
			hash[i+1]=(hash[i]+(ch[i]-'a'+1)*p_pow[i])%m;
	}
	
	static class pair implements Comparable<pair> {
		int x;
		int y;
 
		public pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
 
		public String toString() {
			return x + " " + y;
		}
 
		public int compareTo(pair other) {
			if (this.x == other.x) {
				return this.y - other.y;
			} else {
				return this.x - other.x;
			}
		}
	}
 
	static class tuble implements Comparable<tuble> {
		int x;
		int y;
		int z;
 
		public tuble(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
 
		public String toString() {
			return x + " " + y + " " + z;
		}
 
		public int compareTo(tuble other) {
			if (this.x == other.x) {
				return this.y - other.y;
			} else {
				return this.x - other.x;
			}
		}
	}
 
	public static long GCD(long a, long b) {
		if (b == 0)
			return a;
		if (a == 0)
			return b;
		return (a > b) ? GCD(a % b, b) : GCD(a, b % a);
	}
 
	public static long LCM(long a, long b) {
		return a * b / GCD(a, b);
	}
 
	static long Pow(long a, int e, int mod) // O(log e)
	{
		a %= mod;
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res;
	}
	static long fac[];
	static int mod = 998244353;
	static long nc(int n, int r) {
		if (n < r)
			return 0;
		long v = fac[n];
		v *= Pow(fac[r], mod - 2, mod);
		v %= mod;
		v *= Pow(fac[n - r], mod - 2, mod);
		v %= mod;
		return v;
	}
 
	public static boolean isprime(long a) {
		if (a == 0 || a == 1) {
			return false;
		}
		if (a == 2) {
			return true;
		}
		for (int i = 2; i < Math.sqrt(a) + 1; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

    static PrintWriter pw = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
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

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

    }

}