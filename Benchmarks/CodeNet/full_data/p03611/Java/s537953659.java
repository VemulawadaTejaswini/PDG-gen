import java.util.*;
class Main{
	public static void main(String[] args){
		//Runtime rt = Runtime.getRuntime();
		Scanner in = new Scanner(System.in);
		int N=Integer.parseInt(in.next());
		int[] a=new int[N];
		for (int i=0;i<N;i++){
			a[i]=Integer.parseInt(in.next());
		}
		Arrays.sort(a);
		int Ans=0;
		int c=a[0],t1=0,t2=0,i=0;
		while(i<N){
			if(Math.abs(a[i]-c)<=1){
				t1++;
				Ans=Math.max(t1,Ans);
				if(a[i]-c==1)t2++;
			}
			else{
				Ans=Math.max(t1,Ans);
				t1=t1-t2;t2=0;c=a[i];
			}
			i++;
		}	
		System.out.println(Ans+1);
	}
}