import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[]c=s.next().toCharArray();

		int r=0;
		for(int i=0;i<c.length-2;++i) {
			if(String.valueOf(c,i,3).equals("ABC")) {
				++r;
				c[i]='B';
				c[i+1]='C';
				c[i+2]='A';
				if(i!=0)i-=2;
				//System.err.println(c);
			}
		}
		System.out.println(r);
	}
}