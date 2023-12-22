import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int a = 0;
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++)
		{
			int x = scan.nextInt();
			alist.add(x);
			a += x;
		}
		scan.close();
		
		int v = (a + 4*m-1) / (4 * m);
		
		int count = 0;
		
		for(int i : alist)
		{
			if(i >= v)
			{
				count++;
			}
		}	
				
		if(count >= m)
		{
			System.out.println("Yes");	
		}
		else
		{
			System.out.println("No");
		}
			
	}
}
