import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		long []numberBox=new long[number];
		int error=0;
		for(int i=0;i<number;i++)
		{
			numberBox[i]=sc.nextInt();
			if(numberBox[i]==0)
			{
				error=1;
			}	
		}
		if(error==0)
		{
			checkEven(numberBox,number);
		}	
		else
		{
			System.out.print("0");
		}	
		
	}
	static void checkEven(long[] box,int num)
	{
		int countTimes=0;
		while(true)
		{
			int count=0;
			for(int i=0;i<num;i++)
			{
				if(box[i]%2==0)
					count++;
			}
			if(count==num)
			{
				for(int j=0;j<num;j++)
				{
					box[j]/=2;
				}
				countTimes++;
			}
			else
			{
				System.out.print(countTimes);
				break;
			}
		}	
	}
}