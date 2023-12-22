import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);

		    int N = scanner.nextInt();
		    long array[];
		    array = new long [N];
		    int counter = 0;
		    for(int i = 0; i < array.length; i++)
		    {
		    	array[i] = scanner.nextLong();
		    	while(array[i]%2 == 0)
		    	{
		    		counter = counter + 1;
		    		array[i] = array[i]/2;
		    	}
		    }
		    System.out.println(counter);
		    		scanner.close();}
		  }