class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();		   
		    String s=sc.next();
		    if(n>=s.length())
		   { System.out.println(s);}
		    else
		    {
		        System.out.println(s.substring(0,n)+"...");
		    }
		} catch(Exception e) {
		} finally {
		}
	}
}
