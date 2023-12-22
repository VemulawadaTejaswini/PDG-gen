import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	final static long MOD = 1000000007;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		if(isPal(s,0,l-1) && isPal(s, 0, (l-3)/2) && isPal(s, (l+1)/2, l-1))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static boolean isPal(String n, int l, int u) {
		while(l<u) {
			if(n.charAt(l)!=n.charAt(u))
				return false;
			l++;
			u--;
		}
		return true;
	}

	static int nextInt()throws IOException{
		InputStream in = System.in;
		int ans=0;
		boolean flag=true;
		byte b=0;
		boolean neg=false;
		while ((b>47 && b<58) || flag){
			if(b==45)
				neg=true;
			if(b>=48 && b<58){
				ans=ans*10+(b-48);
				flag=false;
			}
			b=(byte)in.read();
		}
		if(neg)
			return -ans;
		return ans;
	}

	static long nextLong()throws IOException{
		InputStream in=System.in;
		long ans=0;
		boolean flag=true;
		byte b=0;
		while ((b>47 && b<58) || flag){
			if(b>=48 && b<58){
				ans=ans*10+(b-48);
				flag=false;
			}
			b=(byte)in.read();
		}
		return ans;
	}
	static String next()throws Exception{
		StringBuilder sb=new StringBuilder(1<<16);
		InputStream in=System.in;
		byte b=0;
		do{
			if(!isWhiteSpace(b))
				sb.append((char)b);
			b=(byte)in.read();
		}while(!isWhiteSpace(b) || sb.length()==0);
		return sb.toString();
	}
	static boolean isWhiteSpace(byte b){
		char ch=(char)b;
		return ch=='\0' || ch==' ' || ch=='\n';
	}
}