
import java.util.*;
public class Main{
	
	void cal()
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	String as="",bs="";
	
	for(int i=0;i<b;i++)
	{
		as+=a;
	}
	for(int i=0;i<a;i++)
	{
		bs+=b;
	}
	if(a<b)
	{
		System.out.println(as);
		
		
	}
	else if(a>b)
	{
		System.out.println(bs);
		
		
	}
	else if(a==b)
	{
		System.out.println(bs);
		
		
	}
	sc.close();
	
}



public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}



