package CodeFestival2017QualA;

import java.io.*;
import java.util.*;


public class Main{
	public static void main(String[] args) throws Exception{ new Main(new Reader()); }
	public Main(Reader rr) throws IOException{
		int h=rr.ni(), w=rr.ni(), size=h*w;
		int[] freq=new int[26];
		for(int i=0; i<h; i++){
			char[] next=rr.ns().toCharArray();
			for(int j=0; j<w; j++){
				freq[next[j]-97]+=1;
			}
		}
		boolean center=(size%2==1)?true:false;
		int sides=(w%2==1)?h-1:0;
		sides+=(h%2==1)?w-1:0;
		boolean yes=true;
		for(int i=0; yes&&i<26; i++){
			if(freq[i]==0) continue;
			while(freq[i]>=4){
				freq[i]-=4;
			}
			if(freq[i]%2==1){
				if(center) center=false;
				else yes=false;
				freq[i]--;
				if(freq[i]==0) continue;
			}
			if(sides>0&&freq[i]==2){
				sides--;
				freq[i]=0;
				continue;
			}
			if(sides<=0&&freq[i]==2){
				yes=false;
			}
		}
		System.out.println(yes?"Yes":"No");
	}
	static class Reader{
		private DataInputStream din;
		private byte[] buffer=new byte[1024];
		private int bufP, bytR;
		public Reader() throws IOException{
			din=new DataInputStream(System.in);
			bufP=bytR=0;
		}
		public Reader(String file) throws IOException{
			din=new DataInputStream(new FileInputStream(file));
			bufP=bytR=0;
		}
		private String rl() throws IOException{
			byte[] buf=new byte[1024];
			int cnt=0, c;
			while((c=read())!=-1){
				if(c=='\n') break;
				buf[cnt++]=(byte)c;
			}
			return new String(buf, 0, cnt);
		}
		private int ni() throws IOException{
			int num=0;
			byte c=read();
			while(c<=' ') c=read();
			boolean neg=(c=='-');
			if(neg) c=read();
			do{
				num=num*10+c-'0';
			} while((c=read())>='0'&&c<='9');
			if(neg) return -num;
			return num;
		}
		private long nl() throws IOException{
			long num=0;
			byte c=read();
			while(c<=' ') c=read();
			boolean neg=(c=='-');
			if(neg) c=read();
			do{
				num=num*10+c-'0';
			} while((c=read())>='0'&&c<='9');
			if(neg) return -num;
			return num;
		}
		private double nd() throws IOException{ return Double.parseDouble(ns()); }
		private char nc() throws IOException{ return (char)next(); }
		private String ns() throws IOException{
			int c=next();
			StringBuilder sb=new StringBuilder();
			while(!(isChar(c))){
				sb.appendCodePoint(c);
				c=read();
			}
			return sb.toString();
		}
		private char[] ns(int n) throws IOException{
			char[] buf=new char[n];
			int c=next(), r=0;
			while(r<n&&!(isChar(c))){
				buf[r++]=(char)c;
				c=next();
			}
			return n==r?buf:Arrays.copyOf(buf, r);
		}
		private char[][] nm(int n, int m) throws IOException{
			char[][] map=new char[n][];
			for(int i=0; i<n; i++) map[i]=ns(m);
			return map;
		}
		private int[] na(int n) throws IOException{
			int[] a=new int[n];
			for(int i=0; i<n; i++) a[i]=ni();
			return a;
		}
		private boolean isChar(int c) throws IOException{ return !(c>=33&&c<=126); }
		private int next() throws IOException{ int c; while((c=read())!=-1&&isChar(c)); return c; }
		private byte read() throws IOException{
			if(bufP==bytR){
				bytR=din.read(buffer, bufP=0, 1024);
				if(bytR==-1) buffer[0]=-1;
			}
			return buffer[bufP++];
		}
		public void close() throws IOException{
			if(din==null) return;
			din.close();
		}
	}
}
