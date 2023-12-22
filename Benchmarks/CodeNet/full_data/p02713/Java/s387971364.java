import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		long ans =0;
		for(int a=1;a<=N;a++){
			for(int b=1;b<=N;b++){
				for(int c=1;c<=N;c++){
					ans+=gcd(gcd(a,b),c);
				}

			}

		}
		System.out.println(ans);

	}

	public static long gcd(long a, long b) {
		long x, y;
		if (a < b) {
			x = b;
			y = a;
		} else {
			x = a;
			y = b;
		}
		long r;
		while ((r = a % b) != 0) {
			a = b;
			b = r;
		}
		return b;
	}
	public static boolean isPalindromicStr(String s) {
		int h = 0;
		int t = s.length() - 1;
		while (h <= t) {
			if (s.charAt(h) != s.charAt(t)) {
				break;
			}
			h++;
			t--;
		}
		if (h > t) {
			return true;
		}
		return false;
	}


	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}


}
