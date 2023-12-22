import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static class Pair<T,U>{
		T l;U r;
		Pair(T L,U R){l=L;r=R;}
		T getL(){return l;}
		U getR(){return r;}
	}

	public static void main(String[]$){
		String in=s.next();
		System.out.println(""+in.charAt(0)+(in.length()-2)+in.charAt(in.length()-1));
	}
}