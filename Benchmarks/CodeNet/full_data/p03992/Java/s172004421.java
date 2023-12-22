public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(question1(input));
	}
	
	public static String question1(String input)
	{
		String result = input.substring(0, 4) + " " + input.substring(4);
		
		return result;
	}
}