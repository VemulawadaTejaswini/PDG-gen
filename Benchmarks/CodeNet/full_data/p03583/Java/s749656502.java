import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	static long getLong(){return Long.parseLong(s.next());}

	public static void main(String[]$){
		long N=getLong();
		for(long h=0;h<=3500;++h) {
			for(long n=0;n<=3500;++n) {
				long Nhn=N*h*n;
				long v=4*h*n-N*n-N*h;
				if(v>0&&Nhn%v==0) {
					System.out.println(h+" "+n+" "+(Nhn/v));
					return;
				}
			}
		}
	}
}