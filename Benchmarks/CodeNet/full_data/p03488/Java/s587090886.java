import java.util.*;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int x=Math.abs(sc.nextInt()),
			y=Math.abs(sc.nextInt());
		int[] TF=new int[2];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='T')
			{
				TF[0]++;
			}
			else //F
			{
				TF[1]++;
			}
		}
		if(TF[0]==0&&x+y<TF[1])
		{
			System.out.println("No");
		}	
		else if(x+y==TF[1]&&TF[0]%2==0)
		{
			System.out.println("Yes");
		}
		
		else if((TF[1]-x==y*2&&TF[0]%2==0)||(TF[1]-y==x*2&&TF[0]%2==0))
		{
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
		}
		
	}
}