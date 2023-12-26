public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String c=s.next();
		if(n%2==1)
		System.out.println("No");
		else
		{String a=c.substring(0,n/2);
		String b=c.substring(n/2,n);
		if(a.equals(b))
		System.out.println("Yes");
		else
		System.out.println("No");}}}
