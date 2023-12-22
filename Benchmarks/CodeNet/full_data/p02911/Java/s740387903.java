import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int m=s.nextInt(),b=s.nextInt(),n=s.nextInt();
		int[] a=new int[m];
		for(int i=0;i<n;++i)
			++a[s.nextInt()-1];
		for(int i=0;i<m;++i)
			System.out.println(b-n+a[i]>0?"Yes":"No");
	}
}
