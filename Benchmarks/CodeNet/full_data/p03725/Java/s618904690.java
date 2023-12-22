import java.util.Arrays;
import java.util.Scanner;
import java.util.function.LongSupplier;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static final long[] fal_rnd(long[] ar,LongSupplier sp){
		int l=-1,r=ar.length;
		while(l+1!=r)
			ar[Math.random()<0.5?++l:--r]=sp.getAsLong();
		return ar;
	}
	static final IntStream REPS(int v){
		return IntStream.range(0,v);
	};
	static int h,w,k;
	public static void main(String[] __){
		h=s.nextInt();
		w=s.nextInt();
		k=s.nextInt();
		char[][]f=new char[h][];
		int x=-1,y=-1;
		for(int i=0;i<h;i++) {
			String in=s.next();
			if(x==-1) {
				x=in.indexOf('S');
				y=i;
			}
			f[i]=in.toCharArray();
		}
		int[] r={y,h-1-y,x,w-1-x};//udlr
		for(int i=1;i<=k;i++) {
			if(range(y-i,x)&&f[y-i][x]=='.') {
				r[0]--;
			}
			if(range(y+i,x)&&f[y+i][x]=='.') {
				r[1]--;
			}
			if(range(y,x-i)&&f[y][x-i]=='.') {
				r[2]--;
			}
			if(range(y,x+i)&&f[y][x+i]=='.') {
				r[3]--;
			}
		}
		System.out.println((Arrays.stream(r).min().getAsInt()+k-1)/k+1);
	}
	
	static final boolean range(int y,int x) {
		return 0<=y&&y<h&&0<=x&&x<w;
	}
}
/*
7 7 3
###.###
###.###
###.###
###S..#
###.###
#######
#######
*/
