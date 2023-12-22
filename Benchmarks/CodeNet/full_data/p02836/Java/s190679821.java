import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[]c=s.next().toCharArray();
		int r=0,n=c.length;
		for(int i=0;i<n/2;++i)
			if(c[i]!=c[n-i-1])
				++r;
		System.out.println(r);
	}
}
