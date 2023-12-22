import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int n=getInt();
		int in[]=INS(n).toArray();
		
		int c=0;
		for(int i=0;i<n-1;++i) if(i>=0){
			if(in[i]==i+1) {
				int buf=in[i];
				in[i]=in[i+1];
				in[i+1]=buf;
				--i;
				++c;
			}
		}
		System.out.println(c);
	}
}