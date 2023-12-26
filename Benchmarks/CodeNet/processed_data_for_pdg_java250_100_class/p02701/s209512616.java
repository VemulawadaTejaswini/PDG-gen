public class Main
{
	public static void main(String args[]) throws Exception
	{
	    try
	    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[2*100000];
		for(int i=0;i<n;i++)
		{
		          str[i]=sc.next();
		}
		Set<String> set=new HashSet<>(Arrays.asList(str));
		set.remove(null);
		System.out.println(set.size());
	    }
	    catch(Exception e)
	    {}
	}
}
