import java.util.Scanner;

public class M082M1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		int[] dd=new int[(int)Math.pow(10, 5)+1];
		int max=0;
		int buf=0;
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
			dd[a[i]]++;
		}
		for(int i=0;i<N;i++)
		{
			if(a[i]==0){buf=dd[0]+dd[1];}
			else if(a[i]==(int)Math.pow(10, 5)){buf=dd[(int)Math.pow(10, 5)]+dd[(int)Math.pow(10, 5)-1];}
			else{buf=dd[a[i]]+dd[a[i]-1]+dd[a[i]+1];}
			max=(buf>=max)?buf:max;
		}
		System.out.println(max);
	}
}