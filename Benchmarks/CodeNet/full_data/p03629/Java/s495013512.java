import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		StringBuilder sb=new StringBuilder();
		char[]c=s.next().toCharArray();
		int n=c.length;
		for(int i=0;i<n;++i) {
			boolean[]b=new boolean[26];
			int co=0;
			int last=0;
			for(int j=i;j<n;++j) {
				if(!b[c[j]-'a']) {
					b[c[j]-'a']=true;
					last=j;
					if(++co==26)
						break;
				}
			}
			if(co!=26) {
				for(int k=0;k<26;++k) {
					if(!b[k]) {
						sb.append((char)(k+'a'));
						break;
					}
				}
				System.out.println(sb);
				return;
			}
			sb.append(c[last]);
			i=last;
		}
		System.out.println(sb.append('a'));
	}
}