import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
 
	public static void main(String[]$){
		int n=getInt(),m=getInt(),R=getInt();
		int[]r=INS(R).sorted().toArray();
		int[][]f=new int[n][n];
		for(int i=0;i<n;++i) {
			Arrays.fill(f[i],114514191);
			f[i][i]=0;
		}
		for(int i=0;i<m;++i) {
			int a=getInt()-1,b=getInt()-1,c=getInt();
			f[a][b]=c;
			f[b][a]=c;
		}
 
		for(int d=0;d<n;++d) {
			for(int i=0;i<n;++i) {
				for(int j=0;j<n;++j) {
					f[i][j]=Math.min(f[i][j],f[i][d]+f[d][j]);
				}
			}
		}
		//Arrays.stream(f).map(Arrays::toString).forEach(System.out::println);
		int res=Integer.MAX_VALUE;
		do {
			int buf=0;
			for(int i=1;i<R;++i) {
				buf+=f[r[i]-1][r[i-1]-1];
			}
			res=Math.min(res,buf);
		}while((r=nextPermutation(r))!=null);
		System.out.println(res);
	}
	private static int[] nextPermutation(int[] c){
		int first=getFirst(c);
		if(first==-1) return null;
		int toSwap=c.length-1;
		while(c[first]>=c[toSwap])
			--toSwap;
		swap(c,first++,toSwap);
		toSwap=c.length-1;
		while(first<toSwap)
			swap(c,first++,toSwap--);
		return c;
	}
	private static int getFirst(int[] c){
		for(int i=c.length-2;i>=0;--i)
			if(c[i]<c[i+1])
				return i;
		return -1;
	}
	private static void swap(int[] c,int i,int j){
		int tmp=c[i];
		c[i]=c[j];
		c[j]=tmp;
	}
}