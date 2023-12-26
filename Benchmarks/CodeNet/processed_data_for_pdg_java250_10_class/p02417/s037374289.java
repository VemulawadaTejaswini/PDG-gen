public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int[] alphabet = new int[26];
		char moji;
		char MOJI;
		for(int num = 0; num < alphabet.length; num++)
		{
			alphabet[num] = 0;
		}
		while(true)
		{
			String str = input.readLine();
			if(str == null || str.length() == 0)
				break;
			for(int num = 0; num < str.length(); num++)
			{
				moji = 'a';
				MOJI = 'A';
				for(int kazu = 0; kazu < alphabet.length; kazu++, moji++, MOJI++)
				{
					if(str.charAt(num) ==  moji || str.charAt(num) ==  MOJI)
					{
						alphabet[kazu]++;
					break;
					}
				}
			}
		}
		moji = 'a';
		for(int num = 0; num < alphabet.length; num++, moji++)
		{
			System.out.println(moji + " : " + alphabet[num]);
		}
	}
}
