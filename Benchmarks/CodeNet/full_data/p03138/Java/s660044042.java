
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		long k=scn.nextLong();
		long []arr=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextLong();
		}
		int []a=new int[50];
		int count=0;
		for(int i=0;i<n;i++) {
			long x=arr[i];
			int y=0;
			//System.out.println(arr[i]+" uuuuu");
			while(x!=0) {
				if(x%2==1) {
					a[y]++;
				}
				//System.out.print(a[y]+" xx"+x+" ");
				x=x/2;
				y++;
				
			}
			//System.out.println();
			if(count<y) {
				count=y;
			}
		}
		long temp=k;
		int z=0;
		while(temp!=0) {
			temp/=2;
			z++;
		}
		//System.out.println(z+" "+count);
		for(int i=0;i<count;i++) {
			//System.out.println(a[i]);
			if(a[i]>n-a[i]) {
				a[i]=0;
			}else {
				a[i]=1;
			}
		}
		long ans=0;
		//System.out.println(count+" "+z);
		for(int i=0;i<z;i++) {
			if(i<count)
			ans+=Math.pow(2, i)*a[i];
			else
				ans+=Math.pow(2, i);
		}
		
		//System.out.println(ans);
		temp=ans;
		ans=0;
		for(int i=0;i<n;i++) {
			ans+=(temp^arr[i]);
		}
		System.out.println(ans);
	}

}
