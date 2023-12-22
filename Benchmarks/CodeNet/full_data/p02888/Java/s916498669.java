import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]l=new int[n];
		Arrays.setAll(l,i->s.nextInt());

		int p=0;
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++)
					if(l[j]<l[k]+l[i]&&l[k]<l[i]+l[j])
						++p;

		System.out.println(p);
	}
}
