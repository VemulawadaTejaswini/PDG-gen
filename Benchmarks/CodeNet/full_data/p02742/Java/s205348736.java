import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
long b=sc.nextLong();
if(a%2!=0 && b%2!=0)
System.out.println((a*b/2)+1);
else
System.out.println((a*b/2));
/*else 
{
long c=0,s=0;
for(long i=1;i<=b;i=i+2)
{
c=c+1;
}
for(long i=1;i<=a;i++)
{
if(i%2!=0)
{
s=s+c;
}
else
{
s=s+(c-1);
}
}
System.out.println(s);
}*/

}}