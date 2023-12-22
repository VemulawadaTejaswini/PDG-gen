import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    int N = scanner.nextInt();
		    int[] array = new int[N];
		    
		    int max = array[0];
		    int min = array[0];
		    
		    for(int i = 1; i<array.length; i++)
		    {
		    	array[i] = scanner.nextInt();
		    	max = Math.max(max, array[i]);
		    	min = Math.min(min, array[i]);
		    }
		    
		    int Delta = max - min ;
		    System.out.println(Delta);
		    
        	scanner.close();}
		  }