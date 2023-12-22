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
		if(f[y-1][x]=='.') {
			r[0]--;
			if(range(y-2,x)&&f[y-2][x]=='.') {
				r[0]--;
			}
		}
		if(f[y+1][x]=='.') {
			r[1]--;
			if(range(y+2,x)&&f[y+2][x]=='.') {
				r[1]--;
			}
		}
		if(f[y][x-1]=='.') {
			r[2]--;
			if(range(y,x-1)&&f[y][x-2]=='.') {
				r[2]--;
			}
		}
		if(f[y][x+1]=='.') {
			r[3]--;
			if(range(y,x-2)&&f[y][x+2]=='.') {
				r[3]--;
			}
		}
		System.out.println((Arrays.stream(r).min().getAsInt()+k-1)/k+1);
	}
	
	static final boolean range(int y,int x) {
		return 0<=y&&y<h&&0<=x&&x<w;
	}
}
