import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	static class Pair<T,U>{
		T l;U r;
		Pair(T L,U R){l=L;r=R;}
		T getL(){return l;}
		U getR(){return r;}
	}
	public static void main(String[]$){
		int n=getInt();
		int odd=0,_2=0,_4=0;
		for(int i=0;i<n;++i) {
			int in=getInt();
			if(in%4==0) {
				++_4;
			}else if(in%2==0) {
				++_2;
			}else {
				++odd;
			}
		}
		/*
		System.out.println(_4);
		System.out.println(_2);
		System.out.println(odd);
		 */
		int r=odd-1;
		if(_2>0)
			++r;
		System.out.println(r<=_4
				?"Yes":"No"
				);
	}
}