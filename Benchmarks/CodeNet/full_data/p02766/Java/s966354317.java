    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		public static void numberbase(int n, int base)
		{
			int[] array = new int[100];
			int i=0;
			int count=0;
			while(n>0)
			{
				array[i]=n%base;
				n=n/base;
				i++;
				count++;
			}
			/*for (int j = i - 1; j >= 0; j--) 
            {
				System.out.print(array[j]);
				count++;
			}*/
			System.out.println(count);
		}
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int base = scan.nextInt();
			numberbase(n,base);
		}
    }