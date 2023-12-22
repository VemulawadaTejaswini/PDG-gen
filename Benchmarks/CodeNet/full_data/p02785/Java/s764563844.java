
import java.util.*;
public class Main{
	
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		int N,K;
		N=sc.nextInt();
		K=sc.nextInt();
		int sum=0;
		
		int Health[]=new int[N];
		
		
		for(int i=0;i<N;i++)
		{
			Health[i]=sc.nextInt();				
		}
		int temp;
		for (int i = 1; i < Health.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (Health[j] < Health [j - 1]) {
		    	
		      temp = Health[j];
		      Health[j] = Health[j - 1];
		      Health[j - 1] = temp;
		     }
		    }
				
		}
	
		
		  
		for(int i=0;i<N;i++)
		{
			sum=Health[i];
				
		}
	     if(K>=N)
	     {
	    	 System.out.println("0");
	     }
	     else
	     {
	    	 int mov=0;
	    	 while(K>0)
	    	 {
	    		 N--;
	    		 K--;
	    	 }
	    	 for(int i=0;i<N;i++)
	 		{
	 			mov+=Health[i];
	 				
	 		}
	    	 System.out.println(mov);
	    	 
	     }
		
		
		
		sc.close();
		
	}

public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}



