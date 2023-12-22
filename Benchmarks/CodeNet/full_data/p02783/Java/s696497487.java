
import java.util.*;
public class Main{
	
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		int H,A;
		H=sc.nextInt();
		A=sc.nextInt();
		int no=1;
		for(int i=0;i<H;i++)
		{
			H=H-A;
			
			no++;
			if(H<0)
			{
				break;
			}
			
		}
		System.out.println(no);
		
		
		
		
	}
	
	
	
	
	




public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}



