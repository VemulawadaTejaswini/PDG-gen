import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main 
{
 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 
		ArrayList<Integer> A = new ArrayList<Integer>(40000000);
		
		for(int i=0;i<N;i++)
		{
			int a_i=sc.nextInt();
			boolean find = false;
			
			int c=0;
			for (int j : A) 
			{
				if(a_i == j)
				{
					find=true;
					A.remove(c);
					break;
				}
				c++;
			}
			
			if(!find)
			{
				A.add(a_i);
			}
		}
		sc.close();
		
		System.out.println(A.size());
	}
 
}