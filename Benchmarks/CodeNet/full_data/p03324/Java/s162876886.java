import java.util.*;
import java.io.FileInputStream;
import java.io.InputStream;
 
public class Main {
 
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		long d = scan.nextInt();
      	long n = scan.nextInt();
      
      if(d == 0)
       	System.out.println(n);
      else
        System.out.println(n*(long)Math.pow(100, d));
		
	}
	
}