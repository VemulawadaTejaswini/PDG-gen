import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    int N = scanner.nextInt();
		    int[] array = new int[N];
		    
		    for(int i = 0; i < array.length; i++)
		    {
		    	array[i] = scanner.nextInt();
		    	array[i] = array[i] - i - 1;
		    }
		
		int sum = 0;
		    
		    for(int i = 0; i < array.length; i++)
		    {
		    	sum = sum + array[i];
		    }
		int average = sum / N;
		int Total = 0;
		int[] distance = new int[N];
		int sadness = 0;
		    for(int i = 0; i < array.length; i++)
		    {
		         distance[i] = array[i] - average;
		    	 	if(distance[i] < 0)
		    	 	{
		    	 		distance[i] = 0 - distance[i];
		    	 	}
		    	 sadness = sadness + distance[i];
		    }
		   int average1 = average - 1;
		int Total1 = 0;
		int[] distance1 = new int[N];
		int sadness1 = 0;
		    for(int i = 0; i < array.length; i++)
		    {
		         distance1[i] = array[i] - average1;
		    	 	if(distance1[i] < 0)
		    	 	{
		    	 		distance1[i] = 0 - distance1[i];
		    	 	}
		    	 sadness1 = sadness1 + distance1[i];
		   
		    }
        if(sadness1 > sadness)
           {
           System.out.println(sadness);
           }
              else
              {
              System.out.println(sadness1);
              }
        	scanner.close();}
		  }
