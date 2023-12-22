//package AtCoder;
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long[] a=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		
	Arrays.sort(a);
	int i=n-1;
	while(k-->0)
	{
		a[i]=0;
		i--;
	}
	long sum=0;
	for(int j=0;j<=i;j++)
		sum=sum+a[j];
	
	System.out.println(sum);
		
		
	}

}
