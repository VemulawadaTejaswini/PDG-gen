import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		int N=nextInt();
		int k[]=new int[N];
		int f[]=new int[N];
		boolean visit[]=new boolean[N];
		HashMap<String,Integer> ans=new HashMap<String,Integer>();
		String P="",Q="";
		for(int i=0;i<N;i++){
			int a=nextInt()-1;
			P+=String.valueOf(a);
			if(i==0)f[i]=1;
			else f[i]=f[i-1]*(i+1);
		}k[0]=-1;
		for(int i=0;i<N;i++){
			int a=nextInt()-1;
			Q+=String.valueOf(a);
		}
		for(int i=0;i<f[N-1];i++){
			boolean lis=false;
			String a="";
			for(int j=0;j<N;j++){
				int z=0;
				if(j!=N-1&&lis==false&&i%f[N-2-j]==0){
					lis=true;z=k[j]+1;k[j]++;
				}
				if(lis||j==N-1)
					for(int l=z;l<N;l++){
						if(visit[l]==false){
							k[j]=l;break;
						}
					}
				if(k[j]<N)
					visit[k[j]]=true;
				a+=String.valueOf(k[j]);
			}
			visit=new boolean[N];
			ans.put(a,i);
		}
		System.out.println(Math.abs(ans.get(P)-ans.get(Q)));
	}
	static boolean isOK(int index,int key,ArrayList<Integer>a){
		if (a.get(index) >= key) return true;
	    else return false;
	}
	static int binary_search(int key,ArrayList<Integer> a) {
	    int ng = -1; //「index = 0」が条件を満たすこともあるので、初期値は -1
	    int ok = (int)a.size(); // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
	    while (Math.abs(ok - ng) > 1) {
	        int mid = (ok + ng) / 2;

	        if (isOK(mid,key,a)) ok = mid;
	        else ng = mid;
	    }
	    return ok;
	}
	//FastScanner
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
}

