
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		 long a,b;
		a=sc.nextLong();
		b=sc.nextLong();
		long res=1;
		
		for(long i=a;i<=b;i++)
		{
			res*=i;
		}
		
		if(res>0)
		{System.out.println("Positive");}
		else if(res<0)
		{System.out.println("Negative");}
		else
		{System.out.println("Zero");}
		
		sc.close();

	}

}
