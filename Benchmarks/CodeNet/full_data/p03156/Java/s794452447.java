import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=s.nextInt(),b=s.nextInt();
		
		int r=0,t=0,u=0;
		
		for(int i=0;i<n;++i) {
			int v=s.nextInt();
			if(v<=a)
				++r;
			else if(v<=b)
				++t;
			else
				++u;
		}
		System.out.println(Math.min(r,Math.min(t,u)));
	}
}
