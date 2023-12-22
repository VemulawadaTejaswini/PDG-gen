import java.util.*;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] numBox=new int[num];
		
		for(int i=0;i<num;i++)
		{
			numBox[i]=sc.nextInt();
		}
		
		if(num==1&&numBox[0]!=1)
		{
			System.out.println("1");
		}
		else
		{
			Arrays.sort(numBox);
			
			int[] bigBox=new int[numBox[num-1]+1];
			
			for(int i=0;i<num;i++)
			{
				for(int j=1;j<numBox[num-1]+1;j++)
				{
					if(j==numBox[i])
						bigBox[j]++;
				}
			}
			int count=0;
			for(int i=1;i<numBox[num-1]+1;i++)
			{
				if(bigBox[i]!=0)
				{
					if(bigBox[i]>i)
					{
						count+=(bigBox[i]-i);
					}	
					else if(bigBox[i]<i)
					{
						count+=bigBox[i];
					}	
				}
			}
			System.out.println(count);
		}
	}
}
