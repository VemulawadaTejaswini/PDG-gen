import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}
	static IntStream INS(int n){
		return REPS(n).map(i->getInt());
	}
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	
	public static void main(String[]__){
		int n=getInt(),b[]=INS(n).toArray();
		boolean[]sh=new boolean[n];
		
		int i=b[0],c=0;
		while(true){
			if(sh[i])break;
			sh[i]=true;
			i=b[i]-1;
			c++;
		}
		
		System.out.println(sh[1]?c:-1);
	}
}
