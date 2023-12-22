

import java.util.*;

public class Main {
	static int []a=new int [10];
	static int []b=new int [10];
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int count=0,j=0;
		int n=in.nextInt();
		char []b= {'A','B','C'};
		char []a=in.next().toCharArray();
		for(int i=0;i<n;)
		{
			if(a[i]==b[j])
			{
				i++;
				j++;
			}
			else
			{
				i=i-j+1;
				j=0;
			}
			if(j==3)
			{
				count++;
				j=0;
			}
				
		}
		System.out.println(count);
	}
}
