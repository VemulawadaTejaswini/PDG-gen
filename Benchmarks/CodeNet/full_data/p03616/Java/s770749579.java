import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int x=getInt(),k=getInt();
		TreeSet<Integer>turn=new TreeSet<>();
		INS(k).forEach(turn::add);

		for(int q=getInt();q>0;--q) {
			int lt=getInt(),va=getInt(),vb=x-va;
			boolean atob=true;

			int ct=0;
			for(int i:turn.headSet(lt)) {
				int delta=i-ct;
				if(atob) {
					va=Math.max(va-delta,0);
					vb=x-va;
				}else {
					vb=Math.max(vb-delta,0);
					va=x-vb;
				}
				atob^=true;
				ct=i;
			}
			if(atob) {
				va=Math.max(va-(lt-ct),0);
				vb=x-va;
			}else {
				vb=Math.max(vb-(lt-ct),0);
				va=x-vb;
			}
			System.out.println(va);
		}
	}
}