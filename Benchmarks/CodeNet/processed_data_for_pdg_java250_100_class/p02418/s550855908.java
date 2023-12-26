class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		String ring = s + s;
		if (ring.contains(p)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");			
		}
	}
}
