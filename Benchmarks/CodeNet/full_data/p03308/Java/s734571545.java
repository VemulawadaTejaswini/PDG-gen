import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);


		    String str1 = scanner.next();
		    int N = Integer.parseInt(str1);
		    int[] array = new int[N];
		    
		    int maximum = array[0];
		    int minimum = array[0];
		    
		    for(int i = 1; i<array.length; i++)
		    {
		    	int v = array[i];
		    	if(v > maximum)
		    	{
		    		maximum = v;
		    	}
		    	if(v < minimum)
		    	{
		    		minimum = v;
		    	}
		    }
		    
		    int Delta = maximum - minimum ;
		    System.out.println(Delta);
		    
        	scanner.close();}
		  }
