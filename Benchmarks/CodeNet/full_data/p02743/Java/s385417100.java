import java.util.*;
import java.math.*;
public class Main {
	final static double eqs=1e-18;
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	 long a=input.nextLong();long b=input.nextLong();long c=input.nextLong();
	double k=2*Math.sqrt(a*b);
	BigDecimal add=new BigDecimal(a+b-c);
	BigDecimal sq=new BigDecimal(2*Math.sqrt(a*b));
	if(add.add(sq).compareTo(new BigDecimal("0.0000000000000000000000000"))>=0)
	{
		System.out.println("No");
	}
	else
		System.out.println("Yes");
	 
 }
}