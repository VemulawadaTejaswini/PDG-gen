public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int kaisuu = Integer.parseInt(input.readLine());
		int pointT = 0;
		int pointH = 0;
		for(int kai = 0; kai < kaisuu; kai++)
		{
			String[] cards = input.readLine().split(" ");;
			for(int next = 0; next <= cards[0].length(); next++)
			{
				char head = 'a';
				int tarou = 0;
				int hanako = 0;
				int alphabet = 26;
				for(int num = 0; num < alphabet; num++,head++)
				{
					if(next == cards[0].length())
					{
						tarou = -1;
						break;
					}
					if(cards[0].charAt(next) == head)
					{
						tarou = num;
						break;
					}
				}
				head = 'a';
				for(int num = 0; num < alphabet; num++,head++)
				{
					if(next == cards[1].length())
					{
						hanako = -1;
						break;
					}
					if(cards[1].charAt(next) == head)
					{
						hanako = num;
						break;
					}
				}
				if(tarou > hanako)
				{
					pointT = pointT + 3;
					break;
				}
				else if(tarou < hanako)
				{
					pointH = pointH + 3;
					break;
				}
				else if(tarou == -1 && hanako == -1)
				{
					pointT++;
					pointH++;
				}
			}
		}
		System.out.println(pointT + " " + pointH);
	}
}
