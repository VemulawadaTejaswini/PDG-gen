import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static IntStream REPS(int r){
		return IntStream.range(0,r);
	}
	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}
	static IntStream INTS(int l){
		return REPS(l).map(i->getInt());
	}
	public static void main(String[] __){
		StringBuilder sb=new StringBuilder();
		
		s.next();
		String in=s.next();
		
		int addL=0,addR=0;
		for(int i=in.length()-1;i>=0;i--) {
			char c=in.charAt(i);
			if(c=='('){
				if(addL>0)
					addL--;
			}else{
				addL++;
			}
		}
		for(int i=0;i<in.length();i++) {
			char c=in.charAt(i);
			if(c==')'){
				if(addR>0)
					addR--;
			}else{
				addR++;
			}
		}
		for(int i=addL;i>0;i--)
			sb.append("(");
		sb.append(in);
		for(int i=addR;i>0;i--)
			sb.append(")");
		
		System.out.println(sb.toString());
	}
}
