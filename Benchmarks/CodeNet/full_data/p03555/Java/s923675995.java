import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
System.out.println("Enter the number N");
long N = sc.nextInt();
long num=0,num2=0;
for(int i=0;i<=N/2;i++)
{
if(i*i<=N)
num=i*i;
if(num>0)
{
num2=num;
}
else if(num<0)
break;
//System.out.println(num+" i = "+i);
}
System.out.println("The maximun square is "+num2);
}

	}

