public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int x = Integer.parseInt(input);
		x = x*x*x;
		System.out.println(x);
		sc.close();
	}
}
