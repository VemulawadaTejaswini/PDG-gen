import java.util.Scanner;
class Beginner042C {

	public static int checkNumber(int num,int[] arr,int k)
	{
		//System.out.println("First CAll");
		int flag=0,r;
		while(num>0)
		{
			r=num%10;
			for(int i=0;i<k;i++)
			{
				if(r==arr[i])
				{	
					flag=1;
					System.out.println(flag);
					return flag;
				}
			}
			num=num/10;
		}
		//System.out.println(flag);
		return flag;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[k];
		for(int i=0;i<k;i++)
			arr[i]=sc.nextInt();
		int num=n;
		//System.out.println("HELLO");
		if(checkNumber(n,arr,k)!=1)
			System.out.println(n);
		else
		{
			while(checkNumber(num,arr,k)==1)
			{
				num++;
			}
		}
		if(n!=num)
		{
			System.out.println(num);
		}
			

	}

}
