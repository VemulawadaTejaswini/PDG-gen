class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner = new Scanner(System.in);
	 String str = scanner.next();
	int a = Integer.parseInt(str);
    str = scanner.next();
    int b = Integer.parseInt(str);
    System.out.println((a*b) +" "+(a+b+a+b));
	}
}
