import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int[][][]a=new int[n][][];
		for(int i=0;i<n;++i) {
			int m=s.nextInt();
			a[i] = new int[m][2];
			for(int j=0;j<m;++j) {
				a[i][j][0]=s.nextInt()-1;
				a[i][j][1]=s.nextInt();
			}
		}
		int r=0;
		loop:
		for(int b=0;b<(1<<n);++b) {
			for(int i=0;i<n;++i)
				for(int[]q:a[i])
					if((b>>i&1)==1&&(b>>q[0]&1)!=q[1])
						continue loop;
			r=Math.max(r,Integer.bitCount(b));
		}
		System.out.println(r);
	}
}
