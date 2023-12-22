import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
   int b=s.nextInt();
int c=s.nextInt(); 
int count=0;
if(a==b || a==c)
count=2;
if(b==c||b==a)
count=2;
if(count==2)
{
System.out.print("yes");
}
else
{
System.out.print("no");
}

	}


