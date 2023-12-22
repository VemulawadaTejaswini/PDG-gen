import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
public class Main {
    static FastScanner scan=new FastScanner();
    static Scanner scanner=new Scanner(System.in);
    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
    static long lcm (long a, long b) {return a*b/gcd(a,b);}
    static int max(int a,int b) {return a>b?a:b;}
    static int min(int a,int b) {return a<b?a:b;}
    static long factorial(int i) {return i==1?1:i*factorial(i-1);}
    static int lower_bound(int a[],int key) {
        int low=0,high=a.length;
        while(low<high) {
            int mid=((high-low)/2)+low;
            if(a[mid]<=key)low=mid+1;
            else high=mid;
        }
        return high;
        }
    static int upper_bound(int a[],int key) {
        int low=0,high=a.length;
        while(low<high) {
            int mid=((high-low)/2)+low;
            if(a[mid]<key)low=mid+1;
            else high=mid;
        }
        return high;
        }
    static boolean isPrime (long n) {
        if (n==2) return true;
        if (n<2 || n%2==0) return false;
        double d = Math.sqrt(n);
        for (int i=3; i<=d; i+=2)if(n%i==0){return false;}
        return true;
    }
    static int upper_division(int a,int b) {//切り上げ(int)
        if(a%b==0) {
            return a/b;
        }
        else {
            return a/b+1;
        }
    }
    static long lupper_division(long a,long b) {//切り上げ(long)
        if(a%b==0) {
            return a/b;
        }
        else {
            return a/b+1;
        }
    }
    static long lmax(long a,long b) {return Math.max(a, b);}
    static long lmin(long a,long b) {return Math.min(a, b);}
    static int[] setArray(int a) {//配列を作る
        int b[]=new int[a];
        for(int i=0;i<a;i++) {
            b[i]=scan.nextInt();
        }
        return b;
    }
    static String reverce(String str) {//文字列を逆にする
        String strr="";
        for(int i=str.length()-1;i>=0;i--) {
            strr+=str.charAt(i);
        }
        return strr;
    }
    public static void printArray(int[] a) {//配列の空白付き出力
        for(int i=0;i<a.length-1;i++) {
        System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length-1]);
    }
    public static int[][] doublesort(int[][]a) {//二次元配列のソート
        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        return a;
    }
    static long modpow(long x,long n,long mo) {//x^n%mo
        long sum=1;
        while(n>0) {
            if((n&1)==1) {
                sum=sum*x%mo;
            }
            x=x*x%mo;
            n>>=1;
        }
        return sum;
    }
    public static char[] revch(char ch[]) {//char[]を逆にする
		char ret[]=new char[ch.length];
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			ret[j]=ch[i];
		}
		return ret;
	}
	public static int[] revint(int ch[]) {//int[]を逆にする
		int ret[]=new int[ch.length];
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			ret[j]=ch[i];
		}
		return ret;
	}
	public static void main(String[] args) {
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c[][]=new int[b][3];
		for(int i=0;i<b;i++) {
			c[i][0]=scan.nextInt();
			c[i][1]=scan.nextInt();
			c[i][2]=i;
		}
		doublesort(c);
		int st=0;
		int ans[][]=new int[b][2];
		for(int i=1;i<b;i++) {
			if(c[i][0]!=c[i-1][0]) {
				int z=c[i-1][0];
				int x[][]=new int[i-st][2];
				for(int j=0;j<i-st;j++) {
					x[j][0]=c[st+j][1];
					x[j][1]=c[st+j][2];
				}
				doublesort(x);
				for(int j=0;j<i-st;j++) {
					ans[st+j][0]=x[j][1];
					ans[st+j][1]=z*1000000+j+1;
				}
				st=i;
			}
		}
		for(int j=0;j<b-st;j++) {
			ans[st+j][0]=c[st+j][1];
			ans[st+j][1]=c[st+j][0]*1000000+j+1;
		}
		doublesort(ans);
		for(int i=0;i<b;i++) {
			System.out.println(String.format("%012d",ans[i][1]));
		}
	}
}