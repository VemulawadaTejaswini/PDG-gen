import java.util.*;
class jkll
{
public static void main(String args[])
{
int i=0,j=0,flag=0,s;
char a[]={'h','i'};
Scanner inn=new Scanner(System.in);
String v =inn.next();
s=v.length();
if(s%2!=0)
System.out.println("No");
else
{
for(j=0;j<s;j++)
{
i=i%2;
if(v.charAt(j)!=a[i])
{

flag=1;
break;
}
i++;
}
if(flag==0)
System.out.println("Yes");
else
System.out.println("No");
}
}
}