import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int n=s.nextInt();
	static int[] x=new int[n],y=new int[n],h=new int[n];

	static int nonzero=-1;

	static{
		for(int i=0;i<n;++i){
			x[i]=s.nextInt();
			y[i]=s.nextInt();
			h[i]=s.nextInt();
			if(h[i]>0)
				nonzero=i;
		}
	}

	public static void main(String[] $){
		for(int Y=0;Y<=100;++Y){
			loop:
			for(int X=0;X<=100;++X){
				int k=h(Y,X,nonzero);
				for(int i=0;i<n;++i){
					int ph=h(Y,X,i);
					if(k>ph||(k<ph&&h[i]>0))
						continue loop;
				}
				System.out.println(X+" "+Y+" "+k);
				return;
			}
		}
	}
	static int h(int Y,int X,int i){
		return h[i]+Math.abs(X-x[i])+Math.abs(Y-y[i]);
	}
}