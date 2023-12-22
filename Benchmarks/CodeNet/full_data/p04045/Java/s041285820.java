import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args)
	{
		int N;
		int D;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		D = sc.nextInt();
		int d[] = new int[10];
		//System.out.print(d[0]);
		for(int i=0;i<D;i++)
		{
			d[sc.nextInt()]=1;
		}
		int sum=0;
		int start9= 0;
		int maxD = String.valueOf(N).length();
		for(int i=maxD-1;i>=0;i--)
		{
			int x = N/(int)(Math.pow(10,i));
			N = N%(int)Math.pow(10, i);
			//System.out.println("check");
			if(d[x]==1)
			{	
				{
					for(int j=x;j<10;j++)
					{	if(d[j]!=1)
						{
							x=j;
							break;
						}
						else
							if(j==9)
							{	j=-1;
								start9=1;
							}
					}
				}
				
			}
			if(i==(maxD-1) && start9==1)
				sum = sum+10*(int)Math.pow(10,i);
			else
				sum = sum+x*(int)Math.pow(10,i);
			if(N==0)
				break;
		}
		System.out.print(sum);
	}
}
