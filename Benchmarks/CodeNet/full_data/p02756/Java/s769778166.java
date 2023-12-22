import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		
		int q=s.nextInt();
		
		int p=0;
		
		for(int i=0;i<q;i++)
		{
			int t=s.nextInt();
			
			if(t==1)
			{
				if(p==1)
				{
					p=0;
				}
				else
				{
					p=1;
				}
			}
			else
			{
				int f=s.nextInt();
				char c=s.next().charAt(0);
				
				if(f==1)
				{
					if(p==0)
					sb.insert(0,c);
					else
						sb.insert(sb.length()-1,c);
				}
				else
				{
					if(p==1)
						sb.insert(0,c);
						else
							sb.insert(sb.length()-1,c);
				}
			}
		}
		
		if(p==0)
		{
			System.out.println(sb);
		}
		else
		{
			for(int i=sb.length()-1;i>=0;i--)
			{
				System.out.print(sb.charAt(i));
			}
		}
	}
	
}