import java.util.*;
import java.io.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int n = nextInt();
		int m = nextInt();
        Long[] a = new Long[n];

        for(int i = 0; i < n; i++){
            a[i] = nextLong();
        }

        Arrays.sort(a, Collections.reverseOrder());

        long tmp;
        for(int i = 0; i < m; i++){
            a[0] = a[0] / 2;
            if(n > 1 && a[0] < a[1]){
                for(int j = 0; j < n - 1; j++){
                    if(a[j] < a[j+1]){
                        tmp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                    }else break;
                }
            }
        }

        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }

        System.out.println(sum);

    }

    // <Fast Scanner> START -------------------------------------------------
	static InputStream in = System.in;
	static  byte[] buffer = new byte[1024];
	static int length = 0, p = 0;
	public static boolean hasNextByte () {
		if (p < length) return true;
		else {
			p = 0;
			try {length = in.read(buffer);}
			catch (Exception e) {e.printStackTrace();}
			if (length == 0) return false;
		}
		return true;
	}
	public static int readByte () {
		if (hasNextByte() == true) return buffer[p++];
		return -1;
	}
	public static boolean isPrintable (int n) {return 33<=n&&n<=126;}
	public static void skip () {
		while (hasNextByte() && !isPrintable(buffer[p])) p++;
	}
	public static boolean hasNext () {skip(); return hasNextByte();}
	public static String next () {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int temp = readByte();
		while (isPrintable(temp)) {
			sb.appendCodePoint(temp);
			temp = readByte();
		}
		return sb.toString();
	}
	public static int nextInt () {return Math.toIntExact(nextLong());}
	public static int[] nextInts (int n) {
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = nextInt();
		return ar;
	}
	public static long nextLong () {
		if (!hasNext()) throw new NoSuchElementException();
		boolean minus = false;
		int temp = readByte();
		if (temp == '-') {
			minus = true;
			temp = readByte();
		}
		if (temp<'0' || '9'<temp) throw new NumberFormatException();
		long n = 0;
		while (isPrintable(temp)) {
			if ('0'<=temp && temp<='9') {
				n *= 10;
				n += temp - '0';
			}
			temp = readByte();
		}
		return minus? -n : n;
	}
	// <Fast Scanner> END ----------------------------------------------------------

}
