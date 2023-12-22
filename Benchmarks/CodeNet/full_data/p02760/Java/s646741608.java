import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int[] f=new int[9];
		Arrays.setAll(f,i->s.nextInt());
		for(int n=s.nextInt();n>0;--n){
			int i=s.nextInt();
			for(int j=0;j<9;++j)
				if(i==f[j])
					f[j]=0;
		}

		boolean r=false;
		r|=f(f,0,4,8);
		r|=f(f,2,4,6);
		for(int i=0;i<3;++i){
			r|=f(f,i,i+3,i+6);
			r|=f(f,i*3,i*3+1,i*3+2);
		}
		System.out.println(r?"Yes":"No");
	}
	static boolean f(int[] f,int i,int j,int k){
		return f[i]+f[j]+f[k]==0;
	}
}
