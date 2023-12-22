import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringJoiner;
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
	
	public static void main(String[] $){
		int n=getInt();
		
		ArrayDeque<Integer> d=new ArrayDeque<>();
		
		for(int i=0;i<n;i++) {
			int v=getInt();
			if(v%2==0) {
				d.addLast(v);
			}else {
				d.addFirst(v);
			}
		}
		
		StringJoiner j=new StringJoiner(" ");
		
		if(n%2==1) {
			while(!d.isEmpty())
				j.add(String.valueOf(d.pollFirst()));
		}else {
			while(!d.isEmpty())
				j.add(String.valueOf(d.pollLast()));
		}
		System.out.println(j.toString());
	}
}
