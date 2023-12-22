import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
	    Arrays.sort(arr);
	    System.out.println(arr[0]+arr[1]+arr[2]*10);
	    
	}
}
