import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int v=0;
		long r=0;
		for(int i=0;i<n;++i){
			int d=s.nextInt();
			long c=s.nextLong();
			loop:
			while(true){
				//System.err.println(r+" "+v+" "+c+" "+d);
				if(c==0)
					break;
				if(d==0) {
					r+=c;
					break;
				}
				if(c%2==1){
					--c;
					++r;
					if((v+=d)>9){
						v=v%10+v/10;
						++r;
					}
					if(c==0)
						break loop;
				}
				switch(d){
				case 1:
				case 2:
				case 3:
				case 4:
					r+=c/=2;
					d*=2;
					break;
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					r+=c;
					d*=2;
					d=d%10+d/10;
					break;
				}
			}
		}
		System.out.println(r-1);
	}
}
