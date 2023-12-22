import java.util.*;
class poor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         find(a,b,c);
	}

	private static void find(int a, int b, int c) 
	{
		// TODO Auto-generated method stub
		int array[]=new int[3];
		array[0]=a;		array[1]=b;		array[2]=c;
		int count=0;
		for(int i=0;i<2;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				if(array[i]==array[j])
					count++;
			}
		}
		if(count==1)
			System.out.println("Yes");
		else 
			System.out.println("No");
		
		
	}

}
