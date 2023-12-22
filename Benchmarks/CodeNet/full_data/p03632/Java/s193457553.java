import java.util.*;
class test
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int min=Math.min(a,c);
int max=Math.max(b,d);
int ans=max-min;
if(ans<0)
{
System.out.println("0");
}
else
System.out.println(ans);
}
}