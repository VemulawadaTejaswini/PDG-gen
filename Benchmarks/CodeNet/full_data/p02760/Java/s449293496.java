    import java.util.*;
	import java.lang.Math;
    public class Main 
	{
		public static void main(String args[])
		{
			Scanner scan=new Scanner(System.in);
			
			int[] a = new int[9];
			int count=0;
			for(int i=0;i<9;i++)
			{
				a[i]=scan.nextInt();
			}
			int n = scan.nextInt();
			int[] b = new int[n];
			for(int i=0;i<n;i++)
			{
				b[i]=scan.nextInt();
			}
			if(n>=10)
				System.out.println("Yes");
			else
			{
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<9;j++)
					{
						if(b[i]==a[j])
						count++;
					}
				}
				if(count<4)
					System.out.println("No");
				else
					System.out.println("Yes");
			}
		}
	}
	