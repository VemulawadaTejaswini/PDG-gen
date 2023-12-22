import java.util.*;
import java.io.*;
import java.security.acl.Owner;
 
public class Main {
    static long memo[][];
    static long w=0;
    static long [] a;
    static long []b;
    public static long dp(long we,long sum,int ind) {
 
    	if(ind==a.length) {
    		//pw.println("*"+we+" "+sum);
    		return 0;
    	}
    	//pw.println(+we+" "+sum+" "+b[ind]);
    	if(memo[ind][(int) we]!=-1) {
			return memo[ind][(int) we];
		}
    	long take=-1;
    	if(we+a[ind]<=w) {
    	 take=dp(we+a[ind],sum+b[ind], ind+1)+b[ind];
    	}
    	long leave=dp(we, sum, ind+1);
    	return memo[ind][(int) we]=Math.max(take, leave);
 
    }
	public static void main(String[] args) throws Exception {
		int n=sc.nextInt();
		w=sc.nextInt();
		memo=new long[105][100005];
		for(int i=0;i<n;i++) {
			Arrays.fill(memo[i],-1);
		}
		a=new long[n];
		b=new long [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		pw.println(dp( 0, 0, 0));
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
 
        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
 
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
 
	public static boolean isPal(String s) {
		boolean t = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				t = false;
				break;
			}
		}
		return t;
	}
 
	public static long RandomPick(long[] a) {
		int n = a.length;
		int r = rn.nextInt(n);
		return a[r];
	}
 
	public static int RandomPick(int[] a) {
		int n = a.length;
		int r = rn.nextInt(n);
		return a[r];
	}
 
	public static void PH(String s, boolean reverse) {
		prelen = s.length();
		HashsArray[HashsArrayInd] = new int[prelen + 1];
		prepow = new int[prelen];
		if (HashsArrayInd == 0) {
			int[] mods = { 1173017693, 1173038827, 1173069731, 1173086977, 1173089783, 1173092147, 1173107093,
					1173114391, 1173132347, 1173144367, 1173150103, 1173152611, 1173163993, 1173174127, 1173204679,
					1173237343, 1173252107, 1173253331, 1173255653, 1173260183, 1173262943, 1173265439, 1173279091,
					1173285331, 1173286771, 1173288593, 1173298123, 1173302129, 1173308827, 1173310451, 1173312383,
					1173313571, 1173324371, 1173361529, 1173385729, 1173387217, 1173387361, 1173420799, 1173421499,
					1173423077, 1173428083, 1173442159, 1173445549, 1173451681, 1173453299, 1173454729, 1173458401,
					1173459491, 1173464177, 1173468943, 1173470041, 1173477947, 1173500677, 1173507869, 1173522919,
					1173537359, 1173605003, 1173610253, 1173632671, 1173653623, 1173665447, 1173675577, 1173675787,
					1173684683, 1173691109, 1173696907, 1173705257, 1173705523, 1173725389, 1173727601, 1173741953,
					1173747577, 1173751499, 1173759449, 1173760943, 1173761429, 1173762509, 1173769939, 1173771233,
					1173778937, 1173784637, 1173793289, 1173799607, 1173802823, 1173808003, 1173810919, 1173818311,
					1173819293, 1173828167, 1173846677, 1173848941, 1173853249, 1173858341, 1173891613, 1173894053,
					1173908039, 1173909203, 1173961541, 1173968989, 1173999193 };
			mod = RandomPick(mods);
			int[] primes = { 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
			prime = RandomPick(primes);
		}
		prepow[0] = 1;
		if (!reverse) {
 
			for (int i = 1; i < prelen; i++) {
				prepow[i] = (int) ((1l * prepow[i - 1] * prime) % mod);
 
			}
			for (int i = 0; i < prelen; i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					HashsArray[HashsArrayInd][i + 1] = (int) ((1l * HashsArray[HashsArrayInd][i]
							+ ((1l * s.charAt(i) - 'a' + 1) * prepow[i]) % mod) % mod);
				else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					HashsArray[HashsArrayInd][i + 1] = (int) ((1l * HashsArray[HashsArrayInd][i]
							+ ((1l * s.charAt(i) - 'A' + 27) * prepow[i]) % mod) % mod);
				else
					HashsArray[HashsArrayInd][i + 1] = (int) ((1l * HashsArray[HashsArrayInd][i]
							+ ((1l * s.charAt(i) - '0' + 1) * prepow[prelen - 1 - i]) % mod) % mod);
			}
 
		} else {
			for (int i = 1; i < prelen; i++) {
				prepow[i] = (int) ((1l * prepow[i - 1] * prime) % mod);
 
			}
			for (int i = 0; i < prelen; i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					HashsArray[HashsArrayInd][i + 1] = (int) ((1l * HashsArray[HashsArrayInd][i]
							+ ((1l * s.charAt(i) - 'a' + 1) * prepow[prelen - 1 - i]) % mod) % mod);
				else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					HashsArray[HashsArrayInd][i + 1] = (int) ((1l * HashsArray[HashsArrayInd][i]
							+ ((1l * s.charAt(i) - 'A' + 27) * prepow[prelen - 1 - i]) % mod) % mod);
				else
					HashsArray[HashsArrayInd][i + 1] = (int) ((1l * HashsArray[HashsArrayInd][i]
							+ ((1l * s.charAt(i) - '0' + 1) * prepow[prelen - 1 - i]) % mod) % mod);
 
			}
 
		}
 
		HashsArrayInd++;
 
	}
 
	public static int PHV(int l, int r, int n, boolean reverse) {
		if (l > r) {
			return 0;
		}
		int val = (int) ((1l * HashsArray[n - 1][r] + mod - HashsArray[n - 1][l - 1]) % mod);
		if (!reverse) {
 
			val = (int) ((1l * val * prepow[prelen - l]) % mod);
		} else {
			val = (int) ((1l * val * prepow[r - 1]) % mod);
		}
		return val;
	}
 
	static int[][] HashsArray;
	static int HashsArrayInd = 0;
	static int[] prepow;
	static int prelen = 0;
	static int prime = 31;
	static long fac[];
	static int mod = 998244353;
	static Random rn = new Random();
	static Scanner sc = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);
}