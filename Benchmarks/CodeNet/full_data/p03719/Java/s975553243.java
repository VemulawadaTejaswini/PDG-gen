import java.util.Scanner;
publiv class a
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.println("Y");
int a=ob.nextInt();	
int b=ob.nextInt();	
int c=ob.nextInt();
if(c>=a&&c<=b)
{
System.out.println("Yes");
}
else
System.out.println("No");
}
}