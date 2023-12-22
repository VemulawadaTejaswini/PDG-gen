import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
 
	public static void main(String[]$){
		int h=getInt(),w=getInt();
		HashMap<Integer,Integer>charcount=new HashMap<>();
		REPS(h).flatMap(i->s.next().chars()).forEach(o->charcount.merge(o,1,Integer::sum));
 
		HashMap<Integer,Integer>cc=new HashMap<>();
		cc.put(0,0);
		cc.put(1,0);
		cc.put(2,0);
		cc.put(3,0);
		charcount.forEach((a,b)->cc.merge(b%4,1,Integer::sum));
		//System.out.println(cc);
 
		if(h==1||w==1) {
			out(cc.get(1)+cc.get(3)<=1);
			return;
		}
		
		if(h%2==0&&w%2==0) {
			out(cc.get(1)+cc.get(2)+cc.get(3)==0);
			return;
		}
		out(cc.get(1)+cc.get(3)<=1&&cc.get(2)<h%2+w%2);
	}
	private static void out(boolean b){
		System.out.println(b?"Yes":"No");
	}
}