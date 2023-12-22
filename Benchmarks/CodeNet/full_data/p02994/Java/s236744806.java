import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int[] flavour = new int[N];
		int count = 0;
		int zero = 0;
		int flagZero = 0;
		int negative = 0;
		int flagnegative = 0;
		int firstPositiveIndex = 0;
		int flagfirstPositiveIndex = 0;
		int allNegative = 0;
		for(int i = 0; i <N; i++)
		{
		    flavour[i] = L + i;
		    if(flavour[i] > 0 && flagfirstPositiveIndex == 0)
		    {
		        firstPositiveIndex = i;
		        flagfirstPositiveIndex = 1;
		    }
		    if(flavour[i] == 0 && flagZero == 0)
		    {
		        zero = 1;
		        flagZero = 1;
		    }
		    if(flavour[i] < 0)
		    {
		        allNegative = 1; 
		    }
		    if(flavour[i] < 0 && flagnegative == 0)
		    {
		        negative = 1;
		        flagnegative = 1;
		    }
		    
		}
		int sum = 0;
		if(zero == 1)
		{
		    for(int i = 0; i <N; i++)
	    	{
		        sum = sum + flavour[i];
		    }
		    System.out.println(sum);
		}
		else if(negative == 0)
		{
		    for(int i = 1; i <N; i++)
	    	{
		        sum = sum + flavour[i];
		    }
		    System.out.println(sum);
		}
		else if(allNegative == 1)
		{
		    for(int i = 0; i <N-1; i++)
	    	{
		        sum = sum + flavour[i];
		    }
		    System.out.println(sum);
		}
		else
		{
		    for(int i = 0; i <N; i++)
	    	{
	    	    if(i != firstPositiveIndex - 1)
	    	    {
		            sum = sum + flavour[i];
	    	    }
		    }
		    System.out.println(sum);
		}
	}
}
