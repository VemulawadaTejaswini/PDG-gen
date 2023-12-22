import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),q=s.nextInt();
		int[]a=new int[n];
		boolean[]b=new boolean[n];
		int r=0,p=0;
		for(int Q=0;Q<q;++Q){
			int i=s.nextInt()-1;
			if(s.next().equals("WA"))
				++a[i];
			else if(!b[i]){
				++p;
				r+=a[i];
				a[i]=0;
				b[i]=true;
			}
		}
		System.out.println(p+" "+r);
	}
}
