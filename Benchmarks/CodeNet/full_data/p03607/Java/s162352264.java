import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		ArrayList<String> paper = new ArrayList<String>();
		
		int count = 0;
		
		for(int i = 0; i < n ; i++)
		{
			String a = scan.next();
			
			if(!paper.contains(a))
			{
				paper.add(a);
				count++;
			}
			else
			{
				paper.remove(a);
				count--;
			}
		}

		System.out.println(count);
		scan.close();
	}
}
