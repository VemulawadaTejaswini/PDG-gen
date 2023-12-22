import java.util.*;
class Main
{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int n;
		n = input.nextInt();
		String s;
		s = input.next();
		int answer = 0;
		
		
		int dotcount = 0;
		
		
		for(int i = 0; i < n; i++)
		{
			if(s.charAt(i) == '.')
			{
				dotcount++;
			}
		}
		
		int sharpcount = n - dotcount;
		
		if(dotcount >= sharpcount)
		{
			int index = 0;
			int tempanswer = 0;
			while(index < n)
			{
				if(s.charAt(index) == '#')
				{
					tempanswer++;
					index++;
				}
				
				else if(s.charAt(index) == '.')
				{
					answer += tempanswer;
					tempanswer = 0;
					index++;
				}
				else {
					index++;
				}
			}
			
		}
		else
		{
			for(int i = 0; i < n; i++)
			{
				if(i > 0)
				{
					if(s.charAt(i) == '.' && s.charAt(i-1) == '#')
					{
						answer+=1;
					}
				}
			}
		}
		
		System.out.println(answer);
		
	}//end of main
}