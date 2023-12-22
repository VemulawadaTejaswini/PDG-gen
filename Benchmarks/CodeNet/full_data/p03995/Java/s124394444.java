import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 

class Main{ 

	static void solve(){
		int R =ni(), C=ni();
		int n = ni();
		Map<Long, Long> postoa = new HashMap<>();
		long[] r = new long[R];
		long[] c = new long[C];
		Arrays.fill(r, Long.MAX_VALUE/10);
		Arrays.fill(c, Long.MAX_VALUE/10);
		for(int i=0;i<n;++i){
			int rr = ni()-1, cc=ni()-1;
			long a=nl();
			postoa.put((long)rr*C + cc, a);
			r[rr] = Math.min(r[rr], a);
			c[cc] = Math.min(c[cc], a);
		}
		long[] dr = new long[R];
		long[] dc = new long[C];
		Arrays.fill(dr, Long.MAX_VALUE/10);
		Arrays.fill(dc, Long.MAX_VALUE/10);
		for(Map.Entry<Long, Long> entry: postoa.entrySet()){
			int i = (int)(entry.getKey()/C), j = (int)(entry.getKey()%C);
			if(dc[j]==Long.MAX_VALUE/10)dc[j] =entry.getValue()-r[i];
			if(dc[j]!=entry.getValue()-r[i]){
				out.println("No");return;
			}
			if(dr[i]==Long.MAX_VALUE/10)dr[i]=entry.getValue()-c[j];
			if(dr[i]!=entry.getValue()-c[j]){
				out.println("No");return;
			}
		}
		long minr = Long.MAX_VALUE/10, mindc = Long.MAX_VALUE/10;
		for(int i=0;i<R;++i)minr = Math.min(minr, r[i]);
		for(int i=0;i<C;++i)mindc = Math.min(mindc, dc[i]);
		if(minr + mindc < 0){
			out.println("No");return;
		}
		minr = Long.MAX_VALUE/10; mindc = Long.MAX_VALUE/10;
		for(int i=0;i<C;++i)minr = Math.min(minr, c[i]);
		for(int i=0;i<R;++i)mindc = Math.min(mindc, dr[i]);
		if(minr + mindc < 0){
			out.println("No");return;
		}
		long dd = Long.MAX_VALUE/10;
		for(int i=0;i<R;++i){
			if(r[i]==Long.MAX_VALUE/10 || dr[i]==Long.MAX_VALUE/10)continue;
			if(dd==Long.MAX_VALUE/10)dd = r[i]-dr[i];
			if(dd != r[i]-dr[i]){
				out.println("No");return;
			}
		}
		dd = Long.MAX_VALUE/10;
		for(int i=0;i<C;++i){
			if(c[i]==Long.MAX_VALUE/10 || dc[i]==Long.MAX_VALUE/10)continue;
			if(dd==Long.MAX_VALUE/10)dd = c[i] - dc[i];
			if(dd != c[i]-dc[i]){
				out.println("No");return;
			}
		}
		out.println("Yes");
	} 
 
 
 
 
	 public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 static boolean inrange(int y, int x, int h, int w){ 
		 return y>=0 && y<h && x>=0 && x<w; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static<T extends Comparable> int lower_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper - lower>1){ 
		 int center =(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>=0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> int upper_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper-lower >1){ 
		 int center=(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> boolean next_permutation(List<T> list){ 
		 int lastIndex = list.size()-2; 
		 while(lastIndex>=0 && list.get(lastIndex).compareTo(list.get(lastIndex+1))>=0)--lastIndex; 
		 if(lastIndex<0)return false; 
		 int swapIndex = list.size()-1; 
		 while(list.get(lastIndex).compareTo(list.get(swapIndex))>=0)swapIndex--; 
		 T tmp = list.get(lastIndex); 
		 list.set(lastIndex++, list.get(swapIndex)); 
		 list.set(swapIndex, tmp); 
		 swapIndex = list.size()-1; 
		 while(lastIndex<swapIndex){ 
		 tmp = list.get(lastIndex); 
		 list.set(lastIndex, list.get(swapIndex)); 
		 list.set(swapIndex, tmp); 
		 ++lastIndex;--swapIndex; 
		 } 
		 return true; 
	 } 
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

