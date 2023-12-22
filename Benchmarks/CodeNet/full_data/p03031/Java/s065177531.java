import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[][]a=new int[m][];
		int[]p=new int[m];
		for(int i=0;i<m;++i) {
			int t=s.nextInt();
			a[i]=new int[t];
			for(int j=0;j<t;++j)
				a[i][j]=s.nextInt()-1;
		}
		Arrays.setAll(p,i->s.nextInt());

		int r=0;
		loop:
		for(int f=0;f<(1<<n);++f) {
			for(int i=0;i<m;++i) {
				int c=0;
				for(int j=0;j<a[i].length;++j) {
					if((f&(1<<a[i][j]))>0)
						++c;
				}
				if(c%2!=p[i])
					continue loop;
			}
			++r;
		}
		System.out.println(r);
	}
}