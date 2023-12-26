public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine();
		String want = input.readLine();
		boolean judge = false;
		if(want.length() == 1)
		{
			for(int num = 0; num < str.length(); num++)
			{
				if(str.charAt(num) == want.charAt(0))
				{
					judge = true;
					break;
				}
			}
		}
		else
		{
			for(int start = 0; start < str.length(); start++)
			{
				if(str.charAt(start) == want.charAt(0))
				{
					for(int next = 1; next < want.length(); next++)
					{
						if(next + start < str.length())
						{
							if(str.charAt(next + start) != want.charAt(next))
								break;
						}
						else if(next + start >= str.length())
						{
							if(str.charAt(next + start - str.length()) != want.charAt(next))
								break;
						}
						if(next + 1 == want.length())
							judge = true;
					}
				}
			}
		}
		if(judge)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
