import java.util.*;
import java.math.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
long b=sc.nextLong();
long c=sc.nextLong();
double a1=Math.sqrt(a);
double b1=Math.sqrt(b);
double c1=Math.sqrt(c);

if((a1+b1)<c1)
System.out.println("Yes");
else
System.out.println("No");



}
}