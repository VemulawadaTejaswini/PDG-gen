public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int h = s.nextInt();
		int m = s.nextInt();
		double angle = Math.abs((double)(60*h - 11*m)/(double)2);
		angle = Math.toRadians(angle);
		double ans = Math.sqrt(a*a + b*b - (2*a*b*Math.cos(angle)));
		System.out.println(ans);
	}
}
