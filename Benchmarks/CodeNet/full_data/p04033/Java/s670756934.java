
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		 long a,b;
		a=sc.nextLong();
		b=sc.nextLong();
		long c;
		c=(b-a)+1;
		
		 if (a>0)
		{System.out.println("Positive");}
		
		 else if(a<=0 && b>=0)
		{System.out.println("Zero");}
		 
		 else  if(c%2==0)
		 {System.out.println("Positive");}
		 
		 else
		 {System.out.println("Negative");}
			
		
	
		
		sc.close();

	}

}
