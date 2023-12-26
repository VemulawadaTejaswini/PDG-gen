public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		long n = Long.parseLong(s[0]);
		long a = Long.parseLong(s[1]);
		long b = Long.parseLong(s[2]);
		long ans=((n/(a+b))*a)+min(a,n%(a+b));
		out.println(ans);
	}
}
