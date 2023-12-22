import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Scanner myObj = new Scanner(System.in);
		Scanner ret = new Scanner(System.in);
		int a,b=0,i,c=0;
		String s;
		
		
	    //a=ret.nextInt();
		for(i=0;i<3;i++)
		{
			a=ret.nextInt();
			if(a==5)
			{
			 b++;
			}
			else if(a==7)
				c++;
				
		}
		if(b==2&&c==1)
		{
		 System.out.println("YES");
		}
		else
		 System.out.println("NO");
			
	   
	}

}