import java.util.*;

public class Main
 { 

	public static void main(String[] args) 
	{ 
		
			 
			int a,i;
			String t="Yes";
			Scanner s2 = new Scanner(System.in);
	    		a= s2.nextInt();
			int b[]=new int[a];
			for(i=0;i<b.length ;i++)
			{
				b[i]=s2.nextInt();
				
			}
			for(i=0;i<b.length-1 ;i++)
			{

				if(b[i]<=b[i+1])
				{	b[i+1]--;
					t="Yes";
				}
				else
				{
					t="No";
				}		
			}
		System.out.println(t);
	}

}	