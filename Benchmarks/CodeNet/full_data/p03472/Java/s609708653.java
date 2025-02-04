import java.awt.List;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main
{
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	void solve()
	{
		int n=ni(), H=ni();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=ni();
			b[i]=ni();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		long sum=0;
		long ans=0;
		int curA=n-1;
		int curB=n-1;
		while(true) {
			//out.println(sum);
			if(curB<0||a[curA]>=b[curB]) {
				ans+=Math.ceil((H-sum)/(double)a[curA]);
				out.println(ans);
				return;
			}
			else {
				sum+=b[curB];
				curB--;
				ans++;
			}
			if(sum>=H) {
				out.println(ans);
				return;
			}
		}
	
		
	
	}
	
	
	void run() throws Exception
	{
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
	}
	
	public static void main(String[] args) throws Exception 
	{ new Main().run(); }
	
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	
	private int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf)
		{
			ptrbuf = 0;
			try 
			{ lenbuf = is.read(inbuf); } 
			catch (IOException e) 
			{ throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean isSpaceChar(int c)
	{ return !(c >= 33 && c <= 126); }
	private int skip() 
	{ int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private double nd() 
	{ return Double.parseDouble(ns()); }
	private char nc()
	{ return (char)skip(); }
	
	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b)))
		{ // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b)))
		{
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-')
		{
			minus = true;
			b = readByte();
		}
		
		while(true)
		{
			if(b >= '0' && b <= '9')
			{
				num = num * 10 + (b - '0');
			}else
			{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-')
		{
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9')
			{
				num = num * 10 + (b - '0');
			}else
			{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) 
	{ System.out.println(Arrays.deepToString(o)); }
}
