public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = x+y;
		int b = x-y;
		int c = x*y;
		int ans = Math.max(a,Math.max(b,c));
		System.out.println(ans);
	}
}
