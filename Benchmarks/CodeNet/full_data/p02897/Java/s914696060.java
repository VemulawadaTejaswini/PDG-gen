import java.util.*;
class Main
{
	public static void main(String[] args) 	
	{
		Scanner scan=new Scanner(System.in) ;
		int N=scan.nextInt();
		float prob, odd;
		
		if(N>=1 && N<=100)
		{
			if(N%2==0)
				prob=0.5f;
			else
			{
				odd=(N/2)+1;
				prob=odd/N;
			}
			System.out.println(prob);
		}
	}
}
