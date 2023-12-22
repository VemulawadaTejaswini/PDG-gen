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
		System.out.println(answer);
		
	}
}