import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int A[] =new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]=-1;
		}
		
		for(int i=0;i<N;i++)
		{
			int a_i=sc.nextInt();
			boolean find = false;
			for(int j=0;j<i;j++)
			{
				if(A[j]==a_i)
				{
					A[j]=-1;
					find=true;
					break;
				}
			}
			
			
			if(!find)
			{
				A[i]=a_i;
			}
		}
		sc.close();
		
		int sum=0;
		for(int i=0;i<N;i++)
		{
			if(A[i]!=-1)
			{
				sum++;
			}
		}
		
		System.out.println(sum);
	}

}
