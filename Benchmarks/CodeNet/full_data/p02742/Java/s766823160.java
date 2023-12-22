import java.util.*;
import java.math.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
long b=sc.nextLong();

if(a==1 && b==1)
System.out.println(1);
else
System.out.println((long)Math.floor(((a*b)+1)/2));

}}