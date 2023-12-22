public class Main {
	public static BigInteger two=new BigInteger("2"),one=new BigInteger("1"),zero=new BigInteger("0");
	public static long mod=(long) (1e9+7);
	public static long GetAns(BigInteger a)
	{
		if(a.equals(zero)) return 0;
		if(a.equals(one)) return 1;
		if(a.mod(new BigInteger("2")).equals(one))
		{
			return (2*GetAns(a.divide(two))+GetAns(a.divide(two).add(one)))%mod;
		}
		return 3*GetAns(a.divide(two))%mod;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    BigInteger a=new BigInteger("0");
	    for(int i=0;i<s.length();i++)
	    {
	    	a=a.multiply(two);
	    	if(s.charAt(i)=='1')
	    		a=a.add(one);
	    }
	    a=a.add(new BigInteger("1"));
	    System.out.println(GetAns(a));
	}
}
