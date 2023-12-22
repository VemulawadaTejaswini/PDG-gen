import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N+1];
		int buf=0;
		int cnt=0;
		int fl=-100;
		for(int i=1;i<=N;i++)
		{
			a[i]=sc.nextInt();
			if(fl==i-1&&a[i]==i){buf=a[i];a[i]=a[i-1];a[i-1]=buf;cnt++;fl=-100;}
			else{fl=(a[i]==i)?i:-100;}
		}

		for(int i=1;i<N;i++)
		{
			if(a[i]==i){cnt++;}
		}
		System.out.println(cnt);
	}
}