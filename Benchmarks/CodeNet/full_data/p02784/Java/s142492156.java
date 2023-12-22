
import java.util.*;
public class Main{
	
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		int H,N;
		H=sc.nextInt();
		N=sc.nextInt();
		int sum=0;
		int moves[]=new int[N];
		
		for(int i=0;i<N;i++)
		{
			moves[i]=sc.nextInt();
			
			
		}
		for(int i=0;i<N;i++)
		{
			sum+=moves[i];
			
		}
		if(sum>=H)
		{
			System.out.println("Yes");
			
			
		}
		else {
			
			System.out.println("NO");
		}
		sc.close();
		
	}
	
	
	
	
	




public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}



