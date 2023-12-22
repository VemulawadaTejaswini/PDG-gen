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
		char[]in=s.next().toCharArray();
		int l=0;
		for(int i=0;i<n;++i) {
			if(in[i]==')'&&l>0)
				--l;
			if(in[i]=='(')
				++l;
		}
		int r=0;
		for(int i=n-1;i>=0;--i) {
			if(in[i]=='('&&r>0)
				--r;
			if(in[i]==')')
				++r;
		}

		String res="";
		for(int i=0;i<r;++i)
			res+='(';
		res+=String.valueOf(in);
		for(int i=0;i<l;++i)
			res+=')';
		System.out.println(res);
	}
}