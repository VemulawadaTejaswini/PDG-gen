import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		
		long redAllowed   = sc.nextLong();
		long greenAllowed = sc.nextLong();
		
		int totalRed   		= sc.nextInt();
		long[] redApples    = new long[totalRed];
		
		int totalGreen 		= sc.nextInt();
		long[] greenApples    = new long[totalGreen];
		
		int totalColorless  	  = sc.nextInt();
		long[] colorlessApples    = new long[totalColorless];
		
		for(int i=0; i < totalRed; i++)
		{
			redApples[i] = sc.nextLong();
		}
		
		for(int i=0; i < totalGreen; i++)
		{
			greenApples[i] = sc.nextLong();
		}
		
		for(int i=0; i < totalColorless; i++)
		{
			colorlessApples[i] = sc.nextLong();
		}
		
		Arrays.sort(redApples);
		
		Arrays.sort(greenApples);
		
		Arrays.sort(colorlessApples);
		
		
		int redIndex   		= redApples.length - 1;
		int greenIndex 		= greenApples.length - 1;
		int colorlessIndex  = colorlessApples.length - 1;
		
		long maxPossible = 0;
		
		while(redAllowed > 0 || greenAllowed > 0)
		{
			//System.out.println("redAllowed is: "+redAllowed);
			//System.out.println("greenAllowed is: "+greenAllowed);
			long red       = 0;
			long green 	  = 0;
			long colorless = 0;
			
			
			if(redAllowed > 0 && redIndex >= 0)
			{
				 red = redApples[redIndex];
			}
			
			if(greenAllowed > 0 && greenIndex >= 0)
			{
				green = greenApples[greenIndex];
			}
			
			if(colorlessIndex >= 0)
			{
				colorless = colorlessApples[colorlessIndex];
				//System.out.println("colorless is: "+colorless);
			}
			
			if(red >= green && red >= colorless)
			{
				maxPossible += red;
				redAllowed -= 1;
				redIndex -= 1;
			}
			else if(green >= red && green >= colorless)
			{
				maxPossible += green;
				greenAllowed -= 1;
				greenIndex -= 1;
			}
			else if(colorless >= red && colorless >= green)
			{
				maxPossible += colorless;
				colorlessIndex -= 1;
				
				if(redAllowed == 0)
				{
					greenAllowed -= 1;
				}
				else if(greenAllowed == 0)
				{
					redAllowed -= 1;
				}
				else
				{
					if(red >= green)
					{
						greenAllowed -= 1;
					}
					else
					{
						redAllowed -= 1;
					}
				}
			}
			
			//System.out.println(maxPossible);
		}
		
		System.out.println(maxPossible);
		
		
		

	}

}
