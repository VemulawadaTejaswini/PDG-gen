class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int a = value;
		value = scan.nextInt();
		int b = value;
		System.out.println(String.format("%s %s", a*b,2*a+2*b));
	}
}
