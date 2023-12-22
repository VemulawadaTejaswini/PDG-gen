/*input
4
1 1 1 1
*/
import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] f1=new int[100001];
		int[] f2=new int[100001];
		int[] arr=new int[n];
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(i%2==0)
				f1[arr[i]]++;
			else
				f2[arr[i]]++;
		}

		int l11=0,l12=0,l21=0,l22=0;
		int i11=0,i12=0,i21=0,i22=0;
		for(int i=0;i<=100000;i++)
		{
			if(f1[i]>=l11)
			{
				l11=f1[i];
				i11=i;
			}

			if(f2[i]>=l21)
			{
				l21=f2[i];
				i21=i;
			}
		}
		for(int i=0;i<=100000;i++)
		{
			if(i!=i11)
			{
				if(f1[i]>=l12)
				{
					l12=f1[i];
					i12=i;
				}
			}
			
			if(i!=i21)
			{
				if(f2[i]>=l22)
				{
					l22=f2[i];
					i22=i;
				}
			}
			
		}

		if(i11!=i21)
			System.out.println(n/2 - l11 + n/2 - l21);
		else
		{
			int x=Math.max(l11+l22,l12+l21);
			System.out.println(n-x);
		}
	}

	static boolean check(int n)
	{
		int x=n%10;
		n/=10;
		if(n%10!=x)
			return false;
		n/=10;
		if(n%10!=x)
			return false;
		return true;
	}
}