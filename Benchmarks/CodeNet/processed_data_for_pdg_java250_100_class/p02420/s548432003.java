public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		boolean set = true;
		int count = 0;
		ArrayList<String> result = new ArrayList<String>();
		while(set)
		{
			String str = input.readLine();
			if(str.equals("-"))
			{
				for(int num = 0; num < count; num++)
					System.out.println(result.get(num));
				break;
			}
				char[] cards = str.toCharArray();
			int kaisuu = Integer.parseInt(input.readLine());
			int[] maisuu = new int[kaisuu];
			for(int num = 0; num < kaisuu; num++)
				maisuu[num] = Integer.parseInt(input.readLine());
			char[] over = new char[cards.length];
			for(int kai = 0; kai < kaisuu; kai++)
			{
				for(int mai = 0; mai < cards.length; mai++)
				{
					if(mai + maisuu[kai] < cards.length)
						over[mai] = cards[mai + maisuu[kai]];
					else
					{
						over[mai] = cards[mai + maisuu[kai] - cards.length];
					}
				}
				for(int num = 0; num < cards.length; num++)
					cards[num] = over[num];
			}
			result.add(String.valueOf(cards));
			count++;
		}
	}
}
