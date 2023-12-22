import java.util.*;
class a
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a==b || b==c || c==a)
System.out.print("yes");
else
System.out.print("No");
}
}