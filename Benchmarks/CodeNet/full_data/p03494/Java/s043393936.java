import java.util.*;
class main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(); //all number
		long []numberBox=new long[number];
		int error=0;
		for(int i=0;i<number;i++)
		{
			numberBox[i]=sc.nextInt();
			if(numberBox[i]==0)
				error=1;
		}
		if(error==0)
		{
			checkEven(numberBox,number); //check number all even
		}	
		else
		{
			System.out.println("0");
		}	
		
	}
	public static void checkEven(long[] box,int num)
	{
		int countTimes=0; //count number divided times
		while(true)
		{
			int count=0; //count number all even
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
				System.out.println(countTimes);
				break;
			}
		}	
	}
}
