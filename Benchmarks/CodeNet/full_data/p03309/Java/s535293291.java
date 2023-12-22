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
		    System.out.println(sadness);
        	scanner.close();}
		  }