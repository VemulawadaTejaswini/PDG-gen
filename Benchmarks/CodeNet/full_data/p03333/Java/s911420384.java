import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue; 

class Main{ 

	static class Range{
		long l,r;
		boolean used=false;
		Range(long l,long r){this.r=r;this.l=l;}
	}

	static void solve(){ 
		int N = ni();
		PriorityQueue<Range> left = new PriorityQueue<>((a,b)->(int)(b.l-a.l));
		PriorityQueue<Range> right= new PriorityQueue<>((a,b)->(int)(a.r-b.r));
		List<Range> list = new ArrayList<>();
		for(int i=0;i<N;++i){
			long l = nl();
			long r = nl();
			Range range = new Range(l,r);
			left.add(range);
			right.add(range);
			list.add(range);
		}
		long ans = 0;
		long pos = 0;
		while(!right.isEmpty() || !left.isEmpty()){
			while(!left.isEmpty() && left.peek().used)left.poll();
			if(!left.isEmpty()){
				Range r = left.poll();
				r.used=true;
				if(pos<r.l){
					ans+=r.l-pos;pos=r.l;
				}else if(pos>r.r){
					ans+=pos-r.r;pos=r.r;
				}
			}
			while(!right.isEmpty() && right.peek().used)right.poll();
			if(!right.isEmpty()){
				Range r = right.poll();
				r.used=true;
				if(pos<r.l){
					ans+=r.l-pos;pos=r.l;
				}else if(pos>r.r){
					ans+=pos-r.r;pos=r.r;
				}
			}
		}
		ans+=(Math.abs(pos));
		pos = 0;
		for(Range r : list){
			r.used=false;left.add(r);right.add(r);
		}
		long ans2 = 0;
		while(!right.isEmpty() || !left.isEmpty()){
			while(!right.isEmpty() && right.peek().used)right.poll();
			if(!right.isEmpty()){
				Range r = right.poll();
				r.used=true;
				if(pos<r.l){
					ans2+=r.l-pos;pos=r.l;
				}else if(pos>r.r){
					ans2+=pos-r.r;pos=r.r;
				}
			}
			while(!left.isEmpty() && left.peek().used)left.poll();
			if(!left.isEmpty()){
				Range r = left.poll();
				r.used=true;
				if(pos<r.l){
					ans2+=r.l-pos;pos=r.l;
				}else if(pos>r.r){
					ans2+=pos-r.r;pos=r.r;
				}
			}
		}
		ans2+=Math.abs(pos);
		out.println(Math.max(ans,ans2));
	} 
 
 
 
 
	public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 private static final byte[] buffer = new byte[1<<15]; 
	 private static int ptr = 0; 
	 private static int buflen = 0; 
	 private static boolean hasNextByte(){ 
		 if(ptr<buflen)return true; 
		 ptr = 0; 
		 try{ 
			 buflen = in.read(buffer); 
		 } catch (IOException e){ 
			 e.printStackTrace(); 
		 } 
		 return buflen>0; 
	 } 
	 private static int readByte(){ if(hasNextByte()) return buffer[ptr++]; else return -1;} 
	 private static boolean isSpaceChar(int c){ return !(33<=c && c<=126);} 
	 private static int skip(){int res; while((res=readByte())!=-1 && isSpaceChar(res)); return res;} 
 
	 private static double nd(){ return Double.parseDouble(ns()); } 
	 private static char nc(){ return (char)skip(); } 
	 private static String ns(){ 
		 StringBuilder sb = new StringBuilder(); 
		 for(int b=skip();!isSpaceChar(b);b=readByte())sb.append((char)b); 
		 return sb.toString(); 
	 } 
	 private static int[] nia(int n){ 
		 int[] res = new int[n]; 
		 for(int i=0;i<n;++i)res[i]=ni(); 
		 return res; 
	 } 
	 private static long[] nla(int n){ 
		 long[] res = new long[n]; 
		 for(int i=0;i<n;++i)res[i]=nl(); 
		 return res; 
	 } 
	 private static int ni(){ 
		 int res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	 } 
	 private static long nl(){ 
		 long res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	} 
} 

