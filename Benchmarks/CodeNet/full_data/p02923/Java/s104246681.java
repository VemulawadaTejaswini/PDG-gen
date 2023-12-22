import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),p=0,c=0,r=0;
		for(int i=0;i<n;++i) {
			int a=s.nextInt();
			if(p<a)
				c=0;
			else
				++c;
			p=a;
			r=Math.max(r,c);
		}
		System.out.println(r);
	}
}
