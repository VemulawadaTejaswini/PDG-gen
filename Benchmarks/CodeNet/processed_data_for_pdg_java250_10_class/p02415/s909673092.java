public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String originStr = input.readLine();
		String upperStr = originStr.toUpperCase();
		String lowerStr = originStr.toLowerCase();
		char[] originChar = originStr.toCharArray();
		char[] upperChar = upperStr.toCharArray();
		char[] lowerChar = lowerStr.toCharArray();
		for(int num = 0; num < originChar.length; num++)
		{
			if(originChar[num] != upperChar[num])
			{
				System.out.print(upperChar[num]);
			}
			else
			{
				System.out.print(lowerChar[num]);
			}
		}
		System.out.println();
	}
}
