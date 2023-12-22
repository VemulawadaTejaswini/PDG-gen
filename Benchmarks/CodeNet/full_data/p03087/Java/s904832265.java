import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),q=s.nextInt();
		char[]a=s.next().toCharArray();
		int[]b=new int[n];
		for(int i=1;i<n;++i)
			b[i]=b[i-1]+(a[i]=='C'&&a[i-1]=='A'?1:0);
		//System.err.println(Arrays.toString(b));
		for(int i=0;i<q;++i)
			System.out.println(-b[s.nextInt()-1]+b[s.nextInt()-1]);
	}
}
