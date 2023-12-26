public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int coin_big= t/500;
		int rem= t%500;
		int coin_small=rem/5;
		int ans= (coin_big*1000 + coin_small*5 );
		System.out.println(ans);
	}
}
