import java.util.*;
public class Main {
	final static double eqs=1e-18;
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	 long a=input.nextLong();long b=input.nextLong();long c=input.nextLong();
	double k=2*Math.sqrt(a*b);
	if(a+b-c+k>eqs)System.out.println("No");
	else
		System.out.println("Yes");
	 
 }
}