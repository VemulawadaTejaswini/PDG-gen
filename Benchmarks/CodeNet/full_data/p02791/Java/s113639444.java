    import java.util.*;
	import java.lang.Math;
    public class Main 
	{
		
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int fact=1,x,y;
			int count=1;
			int[] a = new int[100];
			for(int i=1;i<=n;i++)
			{
				a[i]=scan.nextInt();
			}
			for(int i=2;i<=n;i++)
			{
				if(a[i+1]<a[i])
					count++;
			}
			System.out.println(count);
		}
    }