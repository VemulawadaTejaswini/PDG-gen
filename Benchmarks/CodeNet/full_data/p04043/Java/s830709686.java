import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] args)
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		String [] anArray = reader.readLine().split(" ");
      
      	int counterFor7 = 0;
        int counterFor5 = 0;
      
      	for(int i = 0; i < anArray.length; i++)
        {
        	if(Integer.parseInt(anArray[i]) == 7)
            {
            	counterFor7++;
            }
            else if(Integer.parseInt(anArray[i]) == 5)
            {
            	counterFor5++;
            }
        }
      
      	if(counterFor7 == 2 && counterFor5 == 1)
        {
        	System.out.println("Yes");
        }
      	else
        {
        	System.out.println("No");
        }
    }
}
