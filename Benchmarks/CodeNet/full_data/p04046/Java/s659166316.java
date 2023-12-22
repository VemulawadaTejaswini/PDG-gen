import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static BigInteger fact(int x)
	{	BigInteger re = new BigInteger("1");
		if(x==0)
			return new BigInteger("1");
		for(int i=1;i<=x;i++)
			re= re.multiply(new BigInteger(Integer.toString(i)));
		return re;
	}
	public static BigInteger combine(int n, int r)
	{
		BigInteger posi;
		posi = fact(n+r).divide(fact(n).multiply(fact(r)));
		return posi;
		
	}
	public static void main(String[] args)
	{	
		
		
			int h,w;
			int a,b;
			Scanner sc = new Scanner(System.in);
			h = sc.nextInt();
			w = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			BigInteger sum = new BigInteger("0");
			sum = sum.add(combine(w-b-1,h-1));
			
			for(int i=2;i<=(h-a);i++)
			{	
				BigInteger n = combine(b-1,i-1);
				sum = sum.add(n.multiply(combine(w-b-1,h-i)));
				
			}
			BigInteger modulo= new BigInteger(Integer.toString(1000000007));
			sum = sum.mod(modulo);
			System.out.println(sum);
		
	}
	
}
