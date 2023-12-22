    import java.util.*;
	import java.lang.Math;
    public class Main 
	{
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double[] arr= new double[100];
			for(int i=0;i<a;i++)
			{
				arr[i]=arr[i]+b;
			}
			for(int i=0;i<a;i++)
			{
				System.out.print(""+arr[i]+"");
			}
			
		}
    }