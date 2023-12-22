import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int h=getInt(),w=getInt(),k=getInt();

		for(int i=0;i<=h;++i) {
			for(int j=0;j<=w;++j) {
				if(calc(i,j,h,w)==k) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
	private static int calc(int i,int j, int h, int w){
		return i*w+j*h-i*j*2;
	}
}