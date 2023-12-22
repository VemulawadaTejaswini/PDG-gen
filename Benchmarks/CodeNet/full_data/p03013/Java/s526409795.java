import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[m];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
		}

		int r=1_000_000_007;
		long[] d=new long[n+1];
		d[0]=1;
		d[1]=1;
		for(int i=0;i<n+1;i++){
			boolean boo=true;
			for(int j=0;j<m;j++){
				if(i==a[j])
				boo=false;
			}
			if(i>1){
			if(boo==true)
			d[i]=(d[i-1]+d[i-2])%r;
			else
			d[i]=0;
			}
		}
		System.out.println(d[n]%r);
		
	}
}