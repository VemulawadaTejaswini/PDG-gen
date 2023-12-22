import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		HashSet<Integer>r=new HashSet<>();
		for(int n=getInt();n>0;--n) {
			int in=getInt();
			if(r.contains(in))
				r.remove(in);
			else
				r.add(in);
		}
		System.out.println(r.size());
	}
}