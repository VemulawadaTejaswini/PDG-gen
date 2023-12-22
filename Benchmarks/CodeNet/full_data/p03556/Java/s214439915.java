import java.util.Scanner;
class Square
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,i,r=0;
n=sc.nextInt();
for(i=1;r<=n;i++)
{
r=i*i;
if(r==n) break;
}
System.out.println(r);
}
}