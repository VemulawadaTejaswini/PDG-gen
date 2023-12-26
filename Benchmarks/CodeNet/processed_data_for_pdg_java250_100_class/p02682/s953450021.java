public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long sum = 0;
		if(a >= k)
		{
		    sum = sum + 1 * k;
		}
		else
		{
		    k = k - a;
		    sum = sum + 1 * a;
		}
		k = k - b;
		if(k >= 1)
		{
		    if(c >= k)
		    {
		        sum = sum + (-1) * k;
		    }
		    else
		    {
		        k = k - c;
		        sum = sum + (-1) * c;
		    }
		}
		System.out.println(sum);
    }
}
