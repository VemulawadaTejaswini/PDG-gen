public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char ip = a.charAt(0);
		if(Character.isUpperCase(ip))
			System.out.println("A");
		else
			System.out.println("a");
		sc.close();
	}
}
